package Collection.List;

public class Documentation {
    /**
     package Collection.List.List;
     public class Documentation {

     /** ArrayList
     *
     * An ArrayList is a resizable array implementation of the List interface.
     * It allows dynamic resizing as elements are added or removed. ArrayLists provide
     * fast random access to elements and are efficient when frequent read operations
     * are required. However, they can be slower when inserting or removing elements
     * from the middle of the list.
     *
     * { ALLOWS FAST RANDOM ACCESS TO ELEMENTS }
     * { Resizes dynamically as elements are added or removed }
     * { Slower than LinkedList for insertions or removals in the middle of the list }
     * { It is backed by an array, which makes it efficient for frequent retrievals. }
     */

    /** LinkedList
     *
     * A LinkedList is a doubly linked list implementation of the List interface.
     * It allows efficient insertions and deletions from both ends of the list, as well
     * as in the middle, but provides slower access to elements compared to an ArrayList.
     * LinkedLists are typically used when frequent insertions and deletions are required
     * and when random access is not a priority.
     *
     * { ALLOWS FAST INSERTION AND REMOVAL FROM BOTH ENDS }
     * { Slower than ArrayList for random access due to the need to traverse the list }
     * { Useful for scenarios where you need to frequently add/remove elements at arbitrary positions. }
     */

    /** Vector
     *
     * A Vector is a growable array-like implementation of the List interface. It is similar
     * to an ArrayList, but unlike ArrayList, a Vector is synchronized, meaning it can be safely
     * used by multiple threads. However, the synchronization comes at the cost of performance
     * in single-threaded scenarios.
     *
     * { SYNCHRONIZED FOR THREAD SAFETY }
     * { Slower than ArrayList due to synchronization overhead }
     * { Deprecated in favor of more modern alternatives like ArrayList in most scenarios }
     * { Suitable for thread-safe applications where synchronization is necessary. }
     */

    /** Stack
     *
     * A Stack is a subclass of Vector that implements a last-in, first-out (LIFO) stack of objects.
     * It supports operations like `push()`, `pop()`, and `peek()`. While a Stack is similar to a Vector,
     * it is more specialized for use in stack-based operations. However, it is considered somewhat outdated
     * and is rarely used in modern Java applications.
     *
     * { LAST-IN, FIRST-OUT (LIFO) STRUCTURE }
     * { Uses the Vector as its internal structure }
     * { Considered outdated; Stack is less commonly used in modern Java applications }
     * { Useful for situations that require stack-based operations like undo functionality. }
     */

    /** CopyOnWriteArrayList
     *
     * A CopyOnWriteArrayList is a thread-safe version of an ArrayList, where every modification
     * (e.g., add, remove) results in a new copy of the underlying array being created. This approach
     * ensures that read operations can occur concurrently without locking, but write operations
     * can be more expensive.
     *
     * { THREAD-SAFE AND IMMUTABLE DURING ITERATION }
     * { Expensive for write operations due to array copying, but allows efficient reads }
     * { Ideal for use cases where reads dominate and modifications are rare, such as in a multi-threaded
     * environment. }
     */


    /*List Type	Ordering	                    Internal Structure
ArrayList	            Insertion order                 	    Growable Array (resizes by 50%)
LinkedList	            Insertion order      	                Doubly Linked List
Vector	                Insertion order	                        Growable Array (synchronized)
CopyOnWriteArrayList	Insertion order                      	Array (copies on every write)
Stack	                Insertion order (LIFO)	                Based on Vector (Growable Array)*/
}

