package by.tms.lesson11.homework1;

import by.teachmeskills.lesson11.homework1.exception.DoesNotEndWith1a2b;
import by.teachmeskills.lesson11.homework1.exception.DoesNotStartWith555;
import by.teachmeskills.lesson11.homework1.exception.NoABCSequenceException;

public class StringHandler {


//    public static void extractTwoNumberBlocks(String input) {
//        String[] array = input.split("-");
//        System.out.println(array[0] + " " + array[2]);
//    }
//
//    public static void replacingWithSymbol(String input) {
//        String[] array = input.split("-");
//        input = input.replace(array[1], "***");
//        input = input.replace(array[3], "***");
//        System.out.println(input);
//    }
//
//    public static void onlyLetters(String input) {
//        String[] array = input.split("-");
//        System.out.println(array[1].toLowerCase() + "/" + array[3].toLowerCase() + "/" + array[4].toLowerCase().charAt(1)
//                + "/" + array[4].toLowerCase().charAt(3));
//    }
//
//
//    public static void showLetters(String input) {
//        String[] array = input.split("-");
//        StringBuilder builder = new StringBuilder();
//        builder.append("Letters: ");
//        builder.append(array[1].toUpperCase());
//        builder.append("/");
//        builder.append(array[3].toUpperCase());
//        builder.append("/");
//        builder.append(array[4].toUpperCase().charAt(1));
//        builder.append("/");
//        builder.append(array[4].toUpperCase().charAt(3));
//        System.out.println(builder);
//    }

    public static void printIfContainsAbc(String input) throws NoABCSequenceException {
        String abc = "aBc";
        if (! input.toUpperCase().contains(abc.toUpperCase())){
            throw new NoABCSequenceException("There is no abc");
        }
        System.out.println(true);
    }

    public static void printIfStartWith555(String input) throws DoesNotStartWith555{
        if (!input.startsWith("555")){
            throw new DoesNotStartWith555("Document doesn't start with 555");
        }
        System.out.println(true);
    }

    public static void printIfEndWith1a2b(String input) throws DoesNotEndWith1a2b {
        if (! input.endsWith("1a2b")){
            throw new DoesNotEndWith1a2b("The document number ends with the sequence 1a2b: " + input.endsWith("1a2b"));
        }
        System.out.println(true);
    }

}
