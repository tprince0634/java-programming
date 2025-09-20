package ThreadingByAman.Fairness;

public class Documentation {
//    DIS-ADVANTAGE OF SYNCHRONIZATION
//    1> FAIRNESS
//    2> NO GUARANTEE
//    3> Deadlock
//    4> Read and write


    /**Fairness of Multi_Threading.Locks
     Fairness in the context of locks refers to the order in which threads acquire a lock.
     A fair lock ensures that threads acquire the lock in the order they requested it,
     preventing thread starvation.
     With a fair lock, if multiple threads are waiting,
     the longest-waiting thread is granted the lock next.
     */

    /*Fairness ensures that no thread is "starved" (i.e., left waiting forever) while others repeatedly get access.

🔄 Without Fairness:
One thread may keep acquiring a lock over and over,
While another thread waits endlessly, even though it’s ready.
This is called starvation.
✅ With Fairness:
Threads are given equal or prioritized opportunity.
Often, first-come, first-served (FIFO) access is enforced.
*/

/*
If true, the lock is fair: threads acquire it in the order they requested it.
If false (default), it's unfair: a thread might "jump the line" if the lock is free
*/



}
