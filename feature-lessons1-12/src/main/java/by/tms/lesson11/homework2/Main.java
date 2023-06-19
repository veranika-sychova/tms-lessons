package by.tms.lesson11.homework2;

import by.teachmeskills.lesson11.homework2.exception.WrongLoginException;
import by.teachmeskills.lesson11.homework2.exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        try {
            Task2.signUp("edkmfskdfnkewdmksdnvksdnvksdnvnfg", "1gjhyjf", "1gjhyjf");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.err.println(e.getMessage());
        }

        try {
            Task2.signUp("dnkdnf", "2kfvmkdvn", "23dfvmdkvm");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.err.println(e.getMessage());
        }

        try {
            Task2.signUp("nfdkvmdskv", "kffn123", "kffn123" );
        }catch (WrongPasswordException | WrongLoginException e) {
            System.err.println(e.getMessage());
        }
    }
}
