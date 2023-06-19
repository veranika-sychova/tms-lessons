package by.tms.lesson11.homework1;

import by.tms.lesson11.homework1.exception.DoesNotEndWith1a2b;
import by.tms.lesson11.homework1.exception.DoesNotStartWith555;
import by.tms.lesson11.homework1.exception.NoABCSequenceException;

public class Homework1 {
    public static void main(String[] args) {

        String strings = "5550-tiu-5678-acc-1a2i";

//        StringHandler.extractTwoNumberBlocks(strings);
//
//        StringHandler.replacingWithSymbol(strings);
//
//        StringHandler.onlyLetters(strings);
//
//        StringHandler.showLetters(strings);
//
        try {
            StringHandler.printIfContainsAbc(strings);
        } catch (NoABCSequenceException e) {
            System.err.println(e.getMessage());
        }

        try {
            StringHandler.printIfStartWith555(strings);
        } catch (DoesNotStartWith555 e) {
            System.err.println(e.getMessage());
        }

        try {
            StringHandler.printIfEndWith1a2b(strings);
        } catch (DoesNotEndWith1a2b e){
            System.err.println(e.getMessage());
        }
    }
}
