package Collection.CollectionandCollections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Carter", 122),
                new Book("Java Fundamentals", 350),
                new Book("Data Structures", 500),
                new Book("Effective Java", 412),
                new Book("Clean Code", 450)
        );

        books.sort(
                Comparator.comparingInt(Book::getPages)
                        .thenComparing(Book::getTitle)
        );

        books.forEach(System.out::println);
    }
}
