package Collection.CandCpractice;

import java.util.*;

class Product {
    private String name;
    private double price;
    private int rating;

    public Product(String name, double price, int rating) {
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
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 800.0, 4));
        products.add(new Product("Tablet", 500.0, 5));
        products.add(new Product("Phone", 500.0, 5));
        products.add(new Product(null, 1000.0, 3));
        products.add(new Product("Monitor", 200.0, 4));
        products.add(new Product("Camera", 500.0, 5));
        products.add(new Product(null, 600.0, 5));

        // ✅ Sort logic
//        products.sort(
//                Comparator.comparingInt(Product::getRating).reversed()
//                        .thenComparing(Product::getPrice)
//                        .thenComparing(Product::getName, Comparator.nullsFirst(String::compareTo))
//        );

        products.sort(Comparator.comparingInt(Product::getRating).reversed()
                .thenComparing(Product::getPrice)
                .thenComparing(Product::getName));

        products.forEach(System.out::println);
    }
}
