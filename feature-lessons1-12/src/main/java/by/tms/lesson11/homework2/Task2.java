package by.tms.lesson11.homework2;

import by.tms.lesson11.homework2.exception.WrongLoginException;
import by.tms.lesson11.homework2.exception.WrongPasswordException;

public class Task2 {

    public static final int LOGIN_MAX_LENGHT = 20;
    public static final int PASSWORD_MAX_LENGHT = 20;

    public static boolean signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login == null || login.contains(" ") || login.length() > LOGIN_MAX_LENGHT) {
            throw new WrongLoginException("Invalid login.");
        }
        if (password == null || password.contains(" ") || password.length() > PASSWORD_MAX_LENGHT) {
            throw new WrongPasswordException("Invalid password");
        }
        boolean containsDigit = false;
        for (int i = 0; i <= 9 ; i++) {
          if (password.contains(String.valueOf(i))){
              containsDigit = true;
              break;
          }
        }
        if (!containsDigit) {
            throw new WrongPasswordException("Password does not contain digits");
        }
        if (! password.equals(confirmPassword)){
            throw new WrongPasswordException("Password and confirm password do not match.");
        }
        System.out.println("Signed up successfully");
        return true;
    }
}
