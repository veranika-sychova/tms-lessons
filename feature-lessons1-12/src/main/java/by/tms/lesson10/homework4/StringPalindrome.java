package by.tms.lesson10.homework4;

import java.util.Scanner;

public class StringPalindrome {

    public static void containsPalindrome(String input) {
        String[] words = input.split(" ");
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.println("Enter the number of the word in the sentence.");
            number = scanner.nextInt();
            if (number > words.length || number <0) {
                System.out.println("Wrong number, please, enter again.");
            } else{
                break;
            }
        }
        System.out.println("Word " + words[number-1] + " is palondrome: " + isPalindrome(words[number-1]));
    }


    public static boolean isPalindrome(String word) {
        StringBuilder builder = new StringBuilder();
        builder.append(word);
        builder.reverse();
        return word.equals(builder.toString());
    }
}


