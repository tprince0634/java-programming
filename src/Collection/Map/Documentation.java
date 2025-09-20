package Collection.Map;

public class Documentation {
    /**  HashMap
     *
     * A HashMap is a data structure used to store data in a key-value pair format.
     * It is part of the Java Collections Framework and provides an efficient way to store,
     * retrieve, and manipulate data.
     *
     *
     * { IT DOES NOT MAINTAIN THE ORDER }
     * {Faster than Linked HashMap because it does Not maintain the order  }
     * */

    /** Linked HashMap
     *
     * A LinkedHashMap is a special type of HashMap in Java that maintains the insertion order
     * of elements. This means that it keeps the order in which key-value pairs are added to
     * the map, unlike a regular HashMap which doesn't guarantee any specific order.
     *
     * { IT  MAINTAIN THE ORDER }
     * { Slower tha HashMap because of the extra linked list structure that maintains the order. }
     * */

    /**
     *
     * Insertion Order (default, accessOrder = false):
     * Entries are iterated in the order they were added to the map.
     * The map maintains the order in which entries were inserted.
     *
     * Access Order (accessOrder = true):
     * Entries are iterated in the order of access, meaning the most recently accessed
     * (either via get() or put()) entries are moved to the end of the map.
     * This is useful for creating cache-like behavior, where the least recently accessed entries can be easily
     * removed (e.g., in an LRU cache).
     * */


        /** TreeMap
         *
         * A TreeMap is a Map implementation that is based on a Red-Black tree.
         * It stores the key-value pairs in sorted order based on the natural ordering of the keys,
         * or by a specified Comparator. It is part of the Java Collections Framework and
         * provides a way to store and access elements in a sorted manner.
         *
         * { IT MAINTAINS THE ORDER OF KEYS IN SORTED FORM }
         * { Slower than HashMap due to the tree structure }
         * { It provides O(log n) time complexity for most operations like put, get, and remove. }
         */

        /** ConcurrentHashMap
         *
         * A ConcurrentHashMap is a thread-safe implementation of the Map interface,
         * which allows concurrent access to elements. It divides the map into segments
         * and locks only the segment being modified, allowing multiple threads to read and modify
         * different segments at the same time. It is designed for high-concurrency environments.
         *
         * { IT PROVIDES THREAD-SAFETY }
         * { Faster for concurrent operations than HashMap because it allows multiple threads to access different segments simultaneously. }
         * { Does not allow null keys or values. }
         * { Supports atomic operations like putIfAbsent(), remove(), and replace() }
         */

        /** WeakHashMap
         *
         * A WeakHashMap is a Map implementation where the keys are weakly referenced.
         * This means that if a key is no longer referenced elsewhere, it can be garbage collected,
         * and the corresponding entry in the map will be removed. It is useful in situations where
         * you want to allow objects to be garbage collected without having to manually remove them from the map.
         *
         * { ALLOWS GARBAGE COLLECTION OF KEYS }
         * { Slower than HashMap because of the weak references to keys }
         * { Useful for implementing caches where entries should be automatically removed when they are no longer in use. }
         */

        /** IdentityHashMap
         *
         * An IdentityHashMap is a special implementation of the Map interface that compares keys
         * based on reference equality (using the `==` operator), instead of the `equals()` method.
         * This means that two keys that are equal according to `equals()` will still be considered
         * different keys in an IdentityHashMap if they are different objects.
         *
         * { COMPARES KEYS BASED ON REFERENCE EQUALITY }
         * { Slower than HashMap in most cases, but useful when reference equality is needed }
         * { It is typically used for situations where the identity of the object itself matters more than its content. }
         */

        /** EnumMap
         *
         * An EnumMap is a specialized implementation of the Map interface for use with enum keys.
         * It is highly efficient because it uses an array internally to store values and only works
         * with enum types. This makes it faster than regular HashMap when working with enum keys.
         *
         * { ONLY FOR ENUM KEYS }
         * { Much faster than HashMap when working with enum keys }
         * { It does not allow null keys or values. }
         */


        /*
        * Map Type	Ordering	Internal Structure
HashMap           	No order	         Rehashing to store elements (Array of buckets)
LinkedHashMap	    Insertion order    	 Rehashing + Doubly Linked List
TreeMap	Sorted      order	             Self-Balancing Red-Black Tree
WeakHashMap	        No order	         Rehashing with Weak References
IdentityHashMap 	No order	         Rehashing using reference equality
EnumMap	Natural     enum order	         Array indexed by enum ordinal*/
    }

