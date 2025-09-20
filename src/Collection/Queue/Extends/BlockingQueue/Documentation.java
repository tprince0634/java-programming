package Collection.Queue.Extends.BlockingQueue;

public class Documentation {
    /*

 🔹 What is BlockingQueue<E> in Java?
    BlockingQueue<E> is an interface in java.util.concurrent package.
    It's a generic, thread-safe queue.
    The E stands for the type of elements the queue will hold.


    Example: BlockingQueue<Integer> — a queue that stores Integer values.
    Example: BlockingQueue<String> — a queue that stores String values


  Blocking Queue
Put ->  Block if the queue is full until the space become available
take -> Block if the queue is empty until an element  become available
offer -> Waits for space to become available ,Up to the specified Timeout

**
 *  Unlike other queues, it does not hold any elements. Instead, each insert operation must wait
 *  for a corresponding remove operation by another thread, and vice versa.
 *  It’s essentially a hand-off mechanism between threads.
 *  */

/**
 *Key Characteristics of SynchronousQueue:
 *
 * No capacity: The queue has no internal buffer.
 * You can't peek at or iterate over elements because there are none.
 *
 * Direct handoff: A thread that inserts an element (put) waits until
 * another thread takes it (take),and vice versa.
 *
 * Used in producer-consumer scenarios: Especially when you want to hand off tasks directly
 * from a producer thread to a consumer thread without any intermediate storage.
 *






Class	Implementation
ArrayBlockingQueue	Fixed-size array-based
LinkedBlockingQueue	Optional capacity (can be unbounded)
PriorityBlockingQueue	Orders by priority (not FIFO)
SynchronousQueue	No internal storage (hand-off)
DelayQueue	Elements become available after delay

*/
}
