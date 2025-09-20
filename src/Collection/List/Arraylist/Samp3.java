package Collection.List.Arraylist;

import java.util.List;

public class Samp3 {
    public static void main(String[] args) {
        /**
         * 2. List.of()
         * The List.of() method is a static factory method introduced in Java 9 that creates an immutable list.
         * This means that once the list is created, you cannot modify it (i.e., you cannot add, remove, or change elements).
         *
         * Key Features:
         * Immutable: The list created by List.of() is immutable, meaning it cannot be changed after creation.
         * Varargs: You can pass a variable number of arguments to create the list.
         * Null Elements: It does not allow null elements. If you try to add a null element, it will throw a NullPointerException.
         */
        // Create an immutable list
        List<String> fruitsList = List.of("Apple", "Banana", "Cherry");

        // Access elements
        System.out.println("First fruit: " + fruitsList.get(0)); // Output: Apple

        // Attempting to modify the list will throw an exception
        // fruitsList.set(1, "Blueberry"); // Throws UnsupportedOperationException
        // fruitsList.add("Orange"); // Throws UnsupportedOperationException

        // Attempting to create a list with null will throw an exception
        // List<String> nullList = List.of("Apple", null); // Throws NullPointerException

    }
}