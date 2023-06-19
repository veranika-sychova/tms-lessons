package by.tms.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to increase: ");
        int numberToIncrease = scanner.nextInt();
        int[][][] array = new int[3][4][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(10);
                }
            }
        }
            System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += numberToIncrease;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}

