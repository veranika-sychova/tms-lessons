package by.tms.lesson10.homework3;

public class Task3 {

    public static String findDesiredWord(String input) {
        String[] words = input.split(" ");
        String min = words[0];
        int numberOfSymbols = input.length();
        for (int i = 0; i < words.length; i++) {
            int current = numberOfDistinctSymbols(words[i]);
            if (current < numberOfSymbols) {
                min = words[i];
                numberOfSymbols = current;
            }
        }
        return min;
    }

    public static int numberOfDistinctSymbols(String word) {
        int number = word.length();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)){
                    number--;
                    break;
                }
            }
        }
        return number;
    }
}
