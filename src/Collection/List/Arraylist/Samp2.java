package Collection.List.Arraylist;
import java.util.Arrays;
import java.util.List;

public class Samp2 {
    public static void main(String[] args) {

        /**
         * 1. Arrays.asList()
         * The Arrays.asList() method is a static method provided by the java.util.Arrays class.
         * It converts an array into a fixed-size list backed by the original array.
         * This means that changes to the list will reflect in the array and vice versa.
         *
         * Key Features:
         * Fixed Size: The list returned by Arrays.asList() has a fixed size.
         * You cannot add or remove elements from this list, but you can modify existing elements.
         * Backed by the Original Array: Any changes made to the list will affect the original array, and vice versa.
         * */

        // Create an array
        String[] fruitsArray = {"Apple", "Banana", "Cherry"};
        // Convert the array to a List
        List<String> fruitsList = Arrays.asList(fruitsArray);

        // Access elements
        System.out.println("First fruit: " + fruitsList.get(0)); // Output: Apple

        // Modify an element
        fruitsList.set(1, "Blueberry");
        System.out.println("Modified list: " + fruitsList); // Output: [Apple, Blueberry, Cherry]

        // Note: You cannot add or remove elements
        // fruitsList.add("Orange"); // Throws UnsupportedOperationException
        // fruitsList.remove(0); // Throws UnsupportedOperationException

    }
}
