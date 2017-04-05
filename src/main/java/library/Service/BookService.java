package library.Service;

import library.Dao.BookDao;
import library.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by MATI on 02.04.2017.
 */

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public Collection<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public Book getBookById(int id) {
        return this.bookDao.getBookById(id);
    }

    public void removeBookById(int id) {
    this.bookDao.removeBookById(id);
    }

    public void updateBook(Book book) {

        this.bookDao.updateBook(book);

    }

    public void insertBook(Book book) {
        this.bookDao.insertBookToDb(book);
    }
}

