package by.tms.model;

public class Book {

    private String id;
    private int numberOfPages;
    private String name;
    private String author;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
