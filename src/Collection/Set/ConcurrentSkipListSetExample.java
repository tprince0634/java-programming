package Collection.Set;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/*5. ConcurrentSkipListSet
✅ Sorted (natural order or custom Comparator).
✅ Thread-safe using skip list structure.
✅ Performance: O(log n) for add, remove, contains.
✅ Supports non-blocking iteration (weakly consistent iterator).
✅ Does not allow null elements.
👉 Best for: High-concurrency, sorted data structures.*/

public class ConcurrentSkipListSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new ConcurrentSkipListSet<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        for(String a : fruits){
            if(a == "Banana"){
                fruits.add("PineApple");
            }
        }

        System.out.println("ConcurrentSkipListSet: " + fruits);
    }
}
