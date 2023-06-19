package by.tms.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Homework4 {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] array = new int[3][3];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int[] elements:array) {
            System.out.println(Arrays.toString(elements));
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum of array numbers is " + sum);
    }
}
