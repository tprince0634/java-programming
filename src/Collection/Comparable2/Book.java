package Collection.Comparable2;

import java.lang.Comparable;
import java.util.LinkedList;
import java.util.List;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private  Double price;

       public Book( String title,String author,Double price){
           this.author= author;
           this.title=title;
           this.price=price;
       }

    public String getauthor() {
        return author;
    }


    public Double getPrice() {
        return price;
    }


    public String getTitle() {
        return title;
    }


    @Override
    public int compareTo(Book o) {
//        return title.author.compareTo(o.author);        //Ascending
          return o.author.compareTo(this.author);         //Decending

    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        List<Book> books = new LinkedList<>();
        books.add(new Book("The Alchemist", "Paulo Coelho", 9.99));
        books.add(new Book("Balochistan", "Aeorge Orwell", 12.99));
        books.add(new Book("Arave New World", "Gldous Huxley", 10.49));
        books.add(new Book("Crow Kill a Mockingbird", "Harper Lee", 11.99));

        books.sort(null);                 //by-default, it uses Compare to method
        System.out.println(books);

    }
}
