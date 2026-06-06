package Collection.Map.WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakReferenceExample {
        public static void main(String[] args) {

            Map<Integer, String> weakMap = new WeakHashMap<>();

            Integer key1 = 1000; // Avoid Integer cache
            String val1 = new String("One");
            weakMap.put(key1, val1);

            Integer key2 = 2000;
            String val2 = new String("Two");
            weakMap.put(key2, val2);

            System.out.println("Before nullifying keys: " + weakMap);

            // Nullify keys (not values)
            key1 = null;

            // Suggest GC
            System.gc();

            try {
                // Sleep to allow GC to complete
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // After GC, key1 entry should be removed automatically because it is weakly referenced
            System.out.println("After nullifying key1 and calling GC: " + weakMap);
        }
    }





/***
 For weak references using a WeakHashMap, the keys are referenced weakly,
 which means entries will be automatically removed when the keys are no longer strongly
 reachable outside the map.
 */
