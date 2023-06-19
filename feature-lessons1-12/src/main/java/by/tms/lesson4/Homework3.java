package by.tms.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];
        Random random = new Random();
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(100);
            arrayTwo[i] = random.nextInt(100);
        }
        System.out.println("Array one: " + Arrays.toString(arrayOne));
        System.out.println("Array two: " + Arrays.toString(arrayTwo));

        double amountOne = 0;
        double amountTwo = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            amountOne += arrayOne[i];
            amountTwo += arrayTwo[i];
        }
        amountOne = amountOne / arrayOne.length;
        amountTwo = amountTwo / arrayTwo.length;
        System.out.println("Arithmetic means arrayOne is " + amountOne);
        System.out.println("Arithmetic means arrayTwo is " + amountTwo);

        if (amountOne < amountTwo) {
            System.out.println("The arithmetic mean of arrayTwo is greater than arrayOne's");
        } else if (amountOne > amountTwo) {
            System.out.println("The arithmetic mean of arrayOne is greater than arrayTwo's");
        } else {
            System.out.println("Arithmetic means are equal");

        }
    }
}


