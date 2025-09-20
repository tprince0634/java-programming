package Collection.Map.HashMap;

public class Documenatation {
    /**
     * Does not maintain order
     * Here's how a HashMap generally works:
     *
     * Array for Buckets: The HashMap uses an array where each index corresponds to a bucket.
     * The index is determined by applying a hash function to the key.
     * This helps quickly locate where a key-value pair might be stored or retrieved.
     *
     * Collision Handling:
     *
     * Chaining (Linked List): If two keys hash to the same bucket (a collision),
     * the HashMap can handle this by chaining the key-value pairs in a linked list or another data
     * structure (like a tree in some cases). This way, multiple key-value pairs can be stored in the same bucket.
     *
     * Open Addressing: Another technique for collision handling is open addressing, where if a collision occurs, the algorithm searches for the next available slot in the array. This could involve linear probing, quadratic probing, or double hashing.
     * No Binary Search Tree (BST): While some advanced implementations of HashMaps (like Java's HashMap or HashTable) may use a balanced tree (such as a red-black tree) for collision resolution when a certain threshold is reached (for example, when the linked list in a bucket becomes too long), it is not the standard structure used. Instead, it's a fallback mechanism when the load factor becomes large.
     *
     * In Summary:
     * Array: Used for storing the "buckets."
     * Linked List (or sometimes tree): Used for handling collisions (chaining).
     * Binary Search Tree: Not typically used for HashMaps, though it may be used as an optimization in certain collision scenarios.*/

    /**
     *
     * Summary of Time Complexities:
     * Average case (common case): O(1) for put, get, and remove
     * Worst case (when collisions happen): O(n) for put, get, and remove
     * Rehashing: O(n) when resizing happens
     *
     *

     * Yes, a HashMap uses both an array and a linked list (or, in some cases, a balanced tree)
     * to manage its data. Here’s how each component works together:
     * */

}
