package by.tms.lesson4.extra;

import java.util.Arrays;
import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i+=2) {
            array[i] = 0;
        }

//        Альтернативное решение:
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) {
//                array[i] = 0;
//            }
//        }

        System.out.println(Arrays.toString(array));

    }
}

