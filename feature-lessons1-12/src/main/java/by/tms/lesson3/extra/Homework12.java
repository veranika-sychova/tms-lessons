package by.tms.lesson3.extra;

public class Homework12 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.println(a + "\n" + b);
        for (int i = 0; i < 11; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}
