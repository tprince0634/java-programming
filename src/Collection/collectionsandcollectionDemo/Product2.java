package Collection.collectionsandcollectionDemo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//This is an example of using Collection  (Collection interface) to store objects.

public class Product2 implements Comparator<Product2> {
    private double price;
    private int rating;
    private String name;

    public Product2(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';

    }

    public static void main(String[] args) {
        List<Product2> products2 = new ArrayList<>();

        // Adding products
        products2.add(new Product2("Laptop", 800.0, 4));
        products2.add(new Product2("Tablet", 600.0, 5));
        products2.add(new Product2("Phone", 700.0, 5));
        products2.add(new Product2(null, 1000.0, 3));
        products2.add(new Product2("Monitor", 200.0, 4));
        products2.add(new Product2("Camera", 500.0, 5));
        products2.add(new Product2(null, 900.0, 0));

        products2.sort(new Product2("",0.0,0));
        System.out.println(products2);
    }


    @Override
    public int compare(Product2 o1, Product2 o2) {
        // First compare by price (ascending)
        int comparePrice = Double.compare(o1.getPrice(), o2.getPrice());

        if (comparePrice != 0) {
            return comparePrice; // If prices are different, return result of price comparison
        }
        // If prices are equal, compare by rating (ascending)
        int compareRating = Integer.compare(o1.getRating(), o2.getRating());

        if (compareRating != 0) {
            return compareRating; // If ratings are different, return result of rating comparison
        }

        return Comparator.nullsFirst(String::compareTo).compare(o1.getName(), o2.getName());
    }


}
