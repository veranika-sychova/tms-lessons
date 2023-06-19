package by.tms.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }

        System.out.println("The first diagonal is ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][i]);
        }

        System.out.println("The second diagonal is ");
        for (int i = 0, j = array.length - 1; i < array.length && j >= 0; i++, j--) {
            System.out.println(array[i][j]);
        }
    }
}

