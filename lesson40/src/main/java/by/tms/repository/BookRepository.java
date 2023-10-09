package by.tms.repository;

import by.tms.exception.BookNameInvalidException;
import by.tms.exception.BookNotFoundException;
import by.tms.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public BookRepository() {
        Book book1 = new Book();
        book1.setId("1");
        book1.setName("Book1");
        book1.setNumberOfPages(200);
        book1.setAuthor("Author1");

        Book book2 = new Book();
        book2.setId("2");
        book2.setName("Book2");
        book2.setNumberOfPages(400);
        book2.setAuthor("Author2");

        Book book3 = new Book();
        book3.setId("3");
        book3.setName("Book3");
        book3.setNumberOfPages(500);
        book3.setAuthor("Author3");

        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

    public List<Book> searchByName (String name) throws BookNotFoundException{
//        if (name == null || name.isEmpty()){
//            throw new BookNameInvalidException("Book name is invalid");
//        }

        List<Book> collect = books.stream()
                .filter(book -> book.getName().equals(name))
                .collect(Collectors.toList());

        if (collect.isEmpty()){
            throw new BookNotFoundException("Book is not found");
        }
        return collect;
    }

}
