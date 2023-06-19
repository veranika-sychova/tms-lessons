package by.tms.lesson10.homework1;

public class StringHandler {


    public static void extractTwoNumberBlocks(String input) {
        String[] array = input.split("-");
        System.out.println(array[0] + " " + array[2]);
    }

    public static void printWithMaskedLetters(String input) {
        String[] array = input.split("-");
        input = input.replace(array[1], "***");
        input = input.replace(array[3], "***");
        System.out.println(input);
    }

    public static void printOnlyLetters(String input) {
        String[] array = input.split("-");
        System.out.println(array[1].toLowerCase() + "/" + array[3].toLowerCase() + "/" + array[4].toLowerCase().charAt(1)
                + "/" + array[4].toLowerCase().charAt(3));
    }


    public static void showLetters(String input) {
        String[] array = input.split("-");
        StringBuilder builder = new StringBuilder();
        builder.append("Letters: ");
        builder.append(array[1].toUpperCase());
        builder.append("/");
        builder.append(array[3].toUpperCase());
        builder.append("/");
        builder.append(array[4].toUpperCase().charAt(1));
        builder.append("/");
        builder.append(array[4].toUpperCase().charAt(3));
        System.out.println(builder);
    }

    public static void printIfContainsAbc(String input) {
        String abc = "aBc";
        System.out.println(input.toUpperCase().contains(abc.toUpperCase()));
    }

    public static void printIfStartWith555(String input) {
        System.out.println("The document number starts with the sequence 555: " + input.startsWith("555"));
    }

    public static void printIfEndWith1a2b(String input) {
        System.out.println("The document number ends with the sequence 1a2b: " + input.endsWith("1a2b"));
    }

}
