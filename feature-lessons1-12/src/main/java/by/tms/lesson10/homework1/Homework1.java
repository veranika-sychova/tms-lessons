package by.tms.lesson10.homework1;

public class Homework1 {
    public static void main(String[] args) {

        String strings = "5550-tiu-5678-abc-1a2b";

        StringHandler.extractTwoNumberBlocks(strings);

        StringHandler.printWithMaskedLetters(strings);

        StringHandler.printOnlyLetters(strings);

        StringHandler.showLetters(strings);

        StringHandler.printIfContainsAbc(strings);

        StringHandler.printIfStartWith555(strings);

        StringHandler.printIfEndWith1a2b(strings);
    }
}
