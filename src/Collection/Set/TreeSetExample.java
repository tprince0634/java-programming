package Collection.Set;


import java.util.Set;
import java.util.TreeSet;

/*
 3. TreeSet
✅ Elements are automatically sorted (natural ordering or via Comparator).
✅ Performance: O(log n) for add, remove, contains (because it uses a Red-Black Tree internally).
✅ Does not allow null elements (throws NullPointerException if you add null).
❌ Not thread-safe.
👉 Best for: When you need sorted elements and can tolerate slightly slower operations than HashSet.*/

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("TreeSet: " + fruits);
    }
}
