package by.tms.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int arraySize = scanner.nextInt();
        double[] array = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = Math.round(Math.random() * 10);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("The maximum value in the array is " + array[arraySize -1]);
        System.out.println("The minimum value in the array is " + array[0]);
        System.out.println("The average value in the array is " + array[arraySize/2]);
    }
}


