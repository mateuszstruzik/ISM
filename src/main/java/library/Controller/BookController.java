package library.Controller;

import library.Entity.Book;
import library.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by MATI on 02.04.2017.
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Book getBookById(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteBookById(@PathVariable("id") int id){
        bookService.removeBookById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateBook(@RequestBody Book book){
        bookService.updateBook(book);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudentBook(@RequestBody Book book){
        bookService.insertBook(book);
    }



}
