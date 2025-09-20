package Collection.Map.SortedHashMap;

public class Documentation {
    /**
     *
     * Constructor:
     *
     * TreeMap() — Creates an empty map with natural ordering of keys.
     * TreeMap(Comparator<? super K> comparator) — Creates an empty map with the given comparator
     * to order the keys.
     *
     *
     * Important Properties:
     *
     * Ordering: The TreeMap ensures that its keys are sorted at all times. This makes it useful when you need a map with sorted keys.
     * Red-Black Tree: Internally, TreeMap uses a Red-Black Tree to store its entries.
     * This ensures that the map operations like get, put, remove run in O(log n) time.
     *
     * Null Keys/Values: Unlike HashMap, TreeMap does not allow null as a key. However, it allows null as a value.*/



    /**
     *
     * 1. SortedMap (Interface)
     * A SortedMap is a type of Map that guarantees the keys will be ordered according to their
     * natural ordering, or by a comparator provided at map creation time. It is a subinterface of Map
     * It maintains the order of the keys, either in natural order (for comparable objects) or via a custom comparator.
     *
     * */


    /**
     * 2. NavigableMap (Interface)
     * A NavigableMap is an extension of the SortedMap interface,
     * which adds navigation methods to allow more advanced operations on a sorted map.
     It is part of the java.util package and represents maps where the keys are ordered.
     Essentially, it provides additional functionality to efficiently navigate the keys
     in both directions (ascending and descending).
     */

    /**
     *
     3. TreeMap (Class)
     A TreeMap is an implementation of both NavigableMap and SortedMap interfaces.
     It is part of Java’s java.util package and provides a map that is sorted according to the natural ordering of its keys,
     or by a comparator provided when the map is created.
     A TreeMap automatically maintains its keys in sorted order.
     It is backed by a Red-Black Tree, which ensures that the map operations
     (such as insertion, deletion, and lookup) are efficient with a time complexity of O(log n).
     */
}
