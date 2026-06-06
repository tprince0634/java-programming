package Collection.Map.WeakHashMap;

import java.util.HashMap;
import java.util.Map;

public class StrongReferenceExample {
    public static void main(String[] args) {


        Map<Integer, String> strongMap = new HashMap<>();

        Integer key1 = 1000 ;                        // Avoid Integer cache
        String val1 = new String("One");
        strongMap.put(key1, val1);

        Integer key2 = 2000;
        String val2 = new String("Two");
        strongMap.put(key2, val2);

        System.out.println("Before nullifying keys: " + strongMap);

        // Nullify keys (not values)
        key1 = null;

        // Suggest GC
        System.gc();
        System.out.println("After nullifying keys and GC: " + strongMap);




        // Now remove the key from the map
        strongMap.remove(1000);
        // Suggest GC
        System.gc();

        System.out.println("After explicitally removing and nullfying  keys and GC: " + strongMap);

    }
}

/*In a HashMap, both keys and values are strongly referenced.
Nullifying a key reference outside the map does not affect the map's ability to hold that key.
To allow an object to be garbage collected, you must remove it from the HashMap or any other collection
that holds a strong reference to it.*/

/**
 * 🔒 HashMap (Strong Reference)
 * Uses strong references for keys and values.
 *
 * As long as a key exists in the map, it is not eligible for garbage collection,
 * even if you remove all other references to it.
 *
 * You must explicitly remove the key from the map for it to be garbage collected.
 * */