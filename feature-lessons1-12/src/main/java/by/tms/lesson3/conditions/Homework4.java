package by.tms.lesson3.conditions;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temperature = scanner.nextInt();
        if (temperature > -5) {
            System.out.println("Warm");
        } else if (temperature > -20) {
            //Temperature is always <=-5 due to the first condition is false
            System.out.println("Normally");
        } else {
            // Temperature is always <= -20 due to the second condition is false
            System.out.println("Cold");
        }

    }
}
