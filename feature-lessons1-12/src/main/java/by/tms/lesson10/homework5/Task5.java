package by.tms.lesson10.homework5;

public class Task5 {

    public static void joinLetters(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
                builder.append(input.charAt(i));
                builder.append(input.charAt(i));
        }
        System.out.println(builder);
    }
}
