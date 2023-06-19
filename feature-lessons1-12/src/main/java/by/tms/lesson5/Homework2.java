package by.tms.lesson5;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == j % 2) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
        }
        for (String[] element : array) {
            System.out.println(Arrays.toString(element));
        }
    }
}
