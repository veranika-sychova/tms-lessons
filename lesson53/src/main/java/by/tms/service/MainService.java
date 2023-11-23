package by.tms.service;

public class MainService {

      public int findSubstring (String string, String substring){

          String s1 = string.toLowerCase();
          String s2 = substring.toLowerCase();

          return s1.indexOf(s2);
      }
}