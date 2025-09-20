package Collection.Map.SortedHashMap;

import java.util.SortedMap;
import java.util.TreeMap;

// It maintains the reverse order on the key based on the comparator
public class Demo3 {
    public static void main(String[] args) {
        // SortedMap with a comparator that sorts keys in descending order (reverse order)
        SortedMap<Integer, String> bb = new TreeMap<>((a, b) -> b - a);

        // Adding key-value pairs
        bb.put(1, "a");
        bb.put(3, "c");
        bb.put(2, "d");
        bb.put(26, "z");

        // Output the map, which will be sorted in reverse order based on the keys
        System.out.println(bb);  // it maintains the reverse order on the key
    }
}
