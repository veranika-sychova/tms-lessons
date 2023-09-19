package by.tms.controller;

import by.tms.model.Book;
import by.tms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String searchResult (@RequestParam String name, Model model){
        List<Book> books = bookRepository.searchByName(name);
        model.addAttribute("books", books);
        return "searchResult.jsp";
    }
}
