package Collection.List.Arraylist;

import java.util.ArrayList;

public class Samp1 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Modify an element
        fruits.set(1, "Blueberry");

        // Remove an element
        fruits.remove("Apple");

        // Check size
        System.out.println("Size of the list: " + fruits.size()); // Output: 2

        // Iterate over the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear the list
        fruits.clear();
        System.out.println("Size after clearing: " + fruits.size()); // Output: 0
    }
}




