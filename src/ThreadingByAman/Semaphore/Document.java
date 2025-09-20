package ThreadingByAman.Semaphore;

public class Document {

/*
    The Semaphore class internally tracks the number of available permits using a counter.

                       🔍 Internals of Semaphore:
Counter (permits):
The semaphore holds an internal integer count of how many permits are available.
Example: Semaphore(3) → starts with a permit count of 3.

Acquire():
When a thread calls acquire(), it tries to decrease the permit count by 1.
If count is 0, the thread blocks (waits) until a permit is available.

Release():
When a thread calls release(), it increases the permit count by 1.
This may unblock a waiting thread (if any).

*/
}
