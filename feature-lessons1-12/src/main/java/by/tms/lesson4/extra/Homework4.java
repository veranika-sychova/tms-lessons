package by.tms.lesson4.extra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int arraySize = scanner.nextInt();
        while (arraySize <= 5 || arraySize > 10) {
            System.out.println("The entered number does not satisfy the condition. Please, re-enter");
            arraySize = scanner.nextInt();
        }
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("The first array is " + Arrays.toString(array));

        int counterEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 == 0) {
                counterEvenNumbers++;
            }
        }

        if (counterEvenNumbers == 0) {
            System.out.println("There are no even numbers");
        } else {
            int[] arrayTwo = new int[counterEvenNumbers];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] %2 == 0) {
                    arrayTwo[j] = array[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(arrayTwo));

        }
    }
}


