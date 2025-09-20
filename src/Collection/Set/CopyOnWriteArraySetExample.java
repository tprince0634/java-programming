package Collection.Set;

import java.util.concurrent.CopyOnWriteArraySet;


/*4. CopyOnWriteArraySet
✅ Maintains insertion order.

✅ Thread-safe without requiring external synchronization.
✅ Safe for iteration even when modified by other threads.
✅ Internally backed by CopyOnWriteArrayList.
✅ Suitable for read-heavy, write-light scenarios (expensive writes because it copies the whole array on each modification).
❌ Performance: Slow for frequent add/remove (O(n) due to array copying).
👉 Best for: Multi-threaded applications where set changes are rare but reads are frequent.*/

public class CopyOnWriteArraySetExample {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> fruits = new CopyOnWriteArraySet<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        for(String a : fruits){
            if(a == "Banana"){
                fruits.add("PineApple");
            }
        }

        System.out.println("CopyOnWriteArraySet: " + fruits);
    }
}
