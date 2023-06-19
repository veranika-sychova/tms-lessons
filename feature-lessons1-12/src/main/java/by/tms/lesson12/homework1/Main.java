package by.tms.lesson12.homework1;

import by.teachmeskills.lesson12.homework1.exception.InvalidDocumentNumberException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path.");
        String filePath = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true){
                String line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                try {
                    validateDocumentNumber(line);
                } catch (InvalidDocumentNumberException e){
                    System.out.println("Line is invalid: " + e.getMessage());
                }
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }

    public static void validateDocumentNumber (String line) throws InvalidDocumentNumberException {

        if (line.length() != 15) {
            throw new InvalidDocumentNumberException ("Line " + line + " length is invalid.");
        }
        if (line.contains("!") || line.contains("@") || line.contains("#")){
            // тут я не перечисляю все служебные символы для локаничности кода, но понимаю, что вообще нужно их все перечислить :)
            throw new InvalidDocumentNumberException("Line " + line + " contains prohibited symbols.");
        }
        if (!line.startsWith("docnum") && !line.startsWith("contract")){
            throw new InvalidDocumentNumberException("Line " + line + " should start from docnum or contract");
        }
    }
}
