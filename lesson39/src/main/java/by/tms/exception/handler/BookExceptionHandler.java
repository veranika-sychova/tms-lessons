package by.tms.exception.handler;

import by.tms.exception.BookNameInvalidException;
import by.tms.exception.BookNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class BookExceptionHandler {

    @ExceptionHandler (BookNameInvalidException.class)
    public String handleBookNameInvalidException (BookNameInvalidException bookNameInvalidException, Model model){
        model.addAttribute("error", bookNameInvalidException.getMessage());
        return "error.jsp";
    }

    @ExceptionHandler (BookNotFoundException.class)
    public String handleBookNotFoundException (BookNotFoundException bookNotFoundException, Model model){
        model.addAttribute("error", bookNotFoundException.getMessage());
        return "error.jsp";
    }
}
