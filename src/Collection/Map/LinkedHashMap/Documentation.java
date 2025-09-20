package Collection.Map.LinkedHashMap;

public class Documentation {

    /**
     * Maintains the order of its entries based on the insertion order
     * To summarize, here are key points from the documentation:
     *
     * Constructor:
     * LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
     * The constructor allows you to specify the initial capacity, load factor,
     * and whether to maintain access order (true for access-ordering, false for insertion-ordering).
     *
     * Methods:
     *
     * put(K key, V value) – Adds a key-value pair to the map.
     * get(Object key) – Retrieves the value for a given key.
     * remove(Object key) – Removes a key-value pair.
     * containsKey(Object key) – Checks if a key exists in the map.
     * keySet() – Returns a set of the keys.
     * values() – Returns a collection of values.
     * entrySet() – Returns a set of key-value pairs (entries).
     * size() – Returns the number of entries in the map.
     * clear() – Clears all entries in the map.
     * Special Behavior:
     * LinkedHashMap maintains the order of the entries, either by insertion order
     * or access order, based on the accessOrder flag set during construction.
     * It can be particularly useful in scenarios where the order of the entries is important,
     * like cache implementations.*/


     /*
     Yes, Java provides an in-built LRU (Least Recently Used) Cache implementation in the form of LinkedHashMap.
      This class can be configured to maintain an LRU cache by overriding its removeEldestEntry method.
     */
}