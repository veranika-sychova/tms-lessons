package by.tms.lesson10.homework2;

public class ThisIsString {

    public static void printLongestWord(String input) {
        String[] words = input.split(" ");
        String max = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }
        System.out.println(max);
    }

    public static void printShortestWord(String input) {
        String[] words = input.split(" ");
        String min = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < min.length()) {
                min = words[i];
            }
        }
        System.out.println(min);
    }

}
