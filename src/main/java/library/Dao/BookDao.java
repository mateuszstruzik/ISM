package library.Dao;

import library.Entity.Book;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by MATI on 02.04.2017.
 */

@Repository
public class BookDao {

private static Map<Integer, Book> books;

static {

    books = new HashMap<Integer,Book>(){
        {
            put(1,new Book(1,"Two towers","Tolkien","fantasy"));
            put(2,new Book(2,"Witcher","Sapkowski","fantasy"));
            put(3,new Book(3,"Harry Potter","Rowling","fantasy"));
        }
    };
}

public Collection<Book>getAllBooks(){
    return this.books.values();
}

public Book getBookById(int id){
    return this.books.get(id);
    }

    public void removeBookById(int id) {
    this.books.remove(id);
    }

    public void updateBook(Book book){

        Book b=books.get(book.getId());
        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
        b.setKind(book.getKind());
        books.put(book.getId(),book);
    }

    public void insertBookToDb(Book book) {
        this.books.put(book.getId(),book);
    }
}
