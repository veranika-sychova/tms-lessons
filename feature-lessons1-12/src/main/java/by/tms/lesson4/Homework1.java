package by.tms.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToRemove = scanner.nextInt();
        int[] array = {23, 56, 12, 3, 23, 5, 7, 12};
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (numberToRemove == array[i]) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There is no entered number");
        } else {
            int[] newArray = new int[array.length - counter];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != numberToRemove) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(newArray));

        }
    }
}