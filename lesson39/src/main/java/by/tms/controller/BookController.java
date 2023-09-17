package by.tms.controller;

import by.tms.controller.payload.SearchBookRequest;
import by.tms.exception.BookNameInvalidException;
import by.tms.exception.BookNotFoundException;
import by.tms.model.Book;
import by.tms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping ("/home")
    public String home (){
        return "search.jsp";
    }

    @PostMapping ("/books")
    public String searchResult (@Valid SearchBookRequest request, BindingResult bindingResult, Model model) throws BookNameInvalidException, BookNotFoundException {
        if (bindingResult.hasErrors()){
            throw new BookNameInvalidException("Book name should not be empty");
        }
        List<Book> books = bookRepository.searchByName(request.getName());
        model.addAttribute("books", books);
        return "searchResult.jsp";

    }
}
