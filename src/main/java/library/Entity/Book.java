package library.Entity;

/**
 * Created by MATI on 02.04.2017.
 */
public class Book {

    private int id;
    private String title;
    private String author;
    private String kind;

    public Book(int id, String title, String author, String kind) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.kind = kind;
    }
    public Book(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
