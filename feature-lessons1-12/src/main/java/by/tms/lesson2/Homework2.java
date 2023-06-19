package by.tms.lesson2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Enter your message");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        System.out.println("Hello " + message);
    }
}
