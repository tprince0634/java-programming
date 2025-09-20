package Threading.Advance;

public class Documentation {
    /**
     * 🔐 synchronized Keyword in Java – Theory
     * 🧠 What is synchronized?
     * synchronized is a keyword in Java used to control access to critical sections of code in a multithreaded environment.
     * It ensures that only one thread at a time can execute a block or method that is marked as synchronized.*/



    /**
     * 1. ✅ Intrinsic Locks (Monitor Locks) – via synchronized
     * Every Java object has a built-in lock, called a monitor lock.
     * When a thread enters a synchronized method or block, it acquires the object's lock.
     * Other threads trying to enter the same synchronized block/method must wait until the lock is released.
     *
     *
     * public synchronized void print() {
     *     // Only one thread can run this at a time
     * }
     * synchronized(this) {
     *     // Critical section
     * }
     * */




    /**
     * 2. 🔧 Explicit Locks – via java.util.concurrent.locks.Lock
     * Java also provides explicit locks through the Lock interface (in java.util.concurrent.locks package),
     * giving you more control than synchronized.
     * */
}
