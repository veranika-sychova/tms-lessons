package service;

import by.tms.service.MainService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainServiceTest {

    MainService mainService = new MainService();

    @Test
    public void test_findSubstring_success() {
        //given
        String string = "string";
        String substring = "in";

        //when
        int result = mainService.findSubstring(string, substring);

        //then
        Assertions.assertEquals(3, result);
    }

    @Test
    public void test_findSubstring_successWithDifferentCases() {
        //given
        String string = "string";
        String substring = "IN";

        //when
        int result = mainService.findSubstring(string, substring);

        //then
        Assertions.assertEquals(3, result);
    }

    @Test
    public void test_findSubstring_fail() {

        String string = "string";
        String substring = "abc";

        int result = mainService.findSubstring(string, substring);

        Assertions.assertEquals(-1, result);
    }


    @Test
    public void test_findSubstring_stringIsEmpty(){
        String string = "";
        String substring = "abc";

        int result = mainService.findSubstring(string, substring);

        Assertions.assertEquals(-1, result);
    }


    @Test
    public void test_findSubstring_substringIsEmpty(){
        String string = "string";
        String substring = "";

        int result = mainService.findSubstring(string, substring);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void test_findSubstring_stringIsNull(){
        String string = null;
        String substring = "abc";

        Assertions.assertThrows(NullPointerException.class, () -> mainService.findSubstring(string,substring));
    }


    @Test
    public void test_findSubstring_substringIsNull(){
        String string = "string";
        String substring = null;

        Assertions.assertThrows(NullPointerException.class, () -> mainService.findSubstring(string,substring));
    }
}
