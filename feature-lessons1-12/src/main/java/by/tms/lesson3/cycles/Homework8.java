package by.tms.lesson3.cycles;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
