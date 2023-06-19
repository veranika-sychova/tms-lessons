package by.tms.lesson3.extra;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the deposit amount");
        float deposit = scanner.nextFloat();

        System.out.println("Enter number of months");
        int numberOfMonth = scanner.nextInt();

        for (int i = 0; i < numberOfMonth; i++) {
            deposit = deposit + deposit * 0.07f;
        }
        System.out.println("Your final amount is " + deposit);
    }
}


