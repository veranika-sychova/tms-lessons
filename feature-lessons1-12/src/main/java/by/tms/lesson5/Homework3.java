package by.tms.lesson5;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[][] arrayOne = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arrayTwo = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] arrayThree = new int[3][3];

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                for (int k = 0; k < 3; k++) {
                    arrayThree[i][j] += arrayOne[i][k] * arrayTwo[k][j];
                }
            }
        }
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.println(Arrays.toString(arrayThree[i]));
        }

    }
}


// 1+0+0+0=1   1 0 0 0       1 2 3
//             0 1 0 0       1 1 1
//             0 0 0 0       0 0 0
//                           2 1 0
