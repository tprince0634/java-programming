package Collection.Set;

import java.util.HashSet;
import java.util.Set;


/*1. HashSet
✅ No duplicates allowed.
✅ Constant time (O(1)) performance for add, remove, and contains operations.
✅ Backed by a HashMap internally.
✅ Allows null elements.
   Rehashing to store elements
❌ Not thread-safe.
❌ No guaranteed order.
👉 Best for: Fast lookups when order doesn’t matter.*/

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("HashSet: " + fruits);
    }
}
