package Collection.Set;
import java.util.LinkedHashSet;
import java.util.Set;


/*2. LinkedHashSet
✅ Maintains insertion order.
✅ Performance: O(1) for add, remove, contains (similar to HashSet).
✅ Internally uses linked list + HashMap to maintain order.
✅ Allows null elements.
❌ Not thread-safe.
 Best for: When you need fast lookup and predictable iteration order.*/

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("LinkedHashSet: " + fruits);
    }
}
