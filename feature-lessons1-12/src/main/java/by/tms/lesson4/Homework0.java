package by.tms.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int[] array = {12, 5, 7, 56, 19};
        Arrays.sort(array);
        int position = Arrays.binarySearch(array, number);
        if (position < 0) {
            System.out.println("The initial number is not presented in the array");
        } else {
            System.out.println("The initial number is presented in the array");
        }
    }
}
