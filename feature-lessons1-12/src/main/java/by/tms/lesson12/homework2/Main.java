package by.tms.lesson12.homework2;

import by.teachmeskills.lesson12.homework1.exception.InvalidDocumentNumberException;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path.");
        String filePath = scanner.nextLine();

        BufferedWriter bufferedWriter = null;
        BufferedWriter bufferedWriter1 = null;

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            File validNumbers = new File("src\\main\\java\\by\\teachmeskills\\lesson12\\homework2\\validNumbers.txt");
            validNumbers.createNewFile();
            FileWriter fileWriter = new FileWriter(validNumbers);
            bufferedWriter = new BufferedWriter(fileWriter);

            File invalidNumbers = new File("src\\main\\java\\by\\teachmeskills\\lesson12\\homework2\\invalidNumbers.txt");
            invalidNumbers.createNewFile();
            FileWriter fileWriter1 = new FileWriter(invalidNumbers);
            bufferedWriter1 = new BufferedWriter(fileWriter1);

            while (true){
                String line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                try {
                    validateDocumentNumber(line);
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();                } catch (InvalidDocumentNumberException e){
                    bufferedWriter1.write(line + " " + e.getMessage());
                    bufferedWriter1.newLine();
                    System.out.println("Line is invalid: " + e.getMessage());
                }
            }
        } catch (IOException e){
            System.out.println(e);
        } finally {
            try {
                bufferedWriter.close();
                bufferedWriter1.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    public static void validateDocumentNumber (String line) throws InvalidDocumentNumberException {

        if (line.length() != 15) {
            throw new InvalidDocumentNumberException ("Line length is invalid.");
        }
        if (line.contains("!") || line.contains("@") || line.contains("#")){
            // тут я не перечисляю все служебные символы для локаничности кода, но понимаю, что вообще нужно их все перечислить :)
            throw new InvalidDocumentNumberException("Line contains prohibited symbols.");
        }
        if (!line.startsWith("docnum") && !line.startsWith("contract")){
            throw new InvalidDocumentNumberException("Line should start from docnum or contract");
        }
    }
}
