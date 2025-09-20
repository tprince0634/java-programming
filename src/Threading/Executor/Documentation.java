package Threading.Executor;

public class Documentation {

    /**
     * Yes, exactly! ✅
     * 🔍 shutdown() is a method defined in the ExecutorService interface — not in the base
     * Executor interface.
     * */


    /**
     * 🔹 shutdown()
     * Initiates an orderly shutdown.
     * No new tasks will be accepted.
     * Already submitted tasks (including those currently running) are allowed to complete.
     * It’s a graceful stop.*/

    /**
     * 🔹 shutdownNow()
     * Attempts to stop all actively executing tasks.
     * Cancels waiting tasks (those in the queue).
     * Returns a list of tasks that were submitted but never started.
     * It’s an immediate, forceful shutdown.*/



//    Interfaces

    /**
     * 1. 🧱 Executor
     * Base interface in the Executor framework.
     * Used to submit tasks for execution.
     * void execute(Runnable command);
     *
     * Executor executor = Executors.newSingleThreadExecutor();
     * executor.execute(() -> System.out.println("Task running")); */


    /**
     ExecutorService Opps.Abstraction.Interface:

     Extends the Executor interface and adds methods for managing the lifecycle of the executor and for submitting tasks. It includes methods like:
     submit(): To submit a task for execution and return a Future object.
     shutdown(): To initiate an orderly shutdown.
     shutdownNow(): To attempt to stop all actively executing tasks

     ✅ Commonly used with: Executors.newFixedThreadPool(), newCachedThreadPool(), etc.
    */

    /**
     * 3. ⏰ ScheduledExecutorService (extends ExecutorService)
     * Adds support for scheduled and periodic task execution.
     * Like a timer, but with a thread pool.
     *
     * ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
     * scheduler.schedule(() -> System.out.println("Delayed Task"), 3, TimeUnit.SECONDS);
     * */


//                     What iS Executors class
    /**
    In Java, the Executors class is part of the java.util.concurrent package and provides
     factory methods for creating different types of thread pools and executor services.
     */


//                       Thread Pools
/** Definition: A thread pool is a collection of pre-initialized threads that are available
    for executing tasks. Instead of creating a new thread for each task, a thread pool reuses
   existing threads, which can improve performance and resource management.
 */


/**
 * Types: There are several types of thread pools, such as:

 * Fixed Thread Pool
 * Description: A fixed thread pool has a fixed number of threads that are created when the pool
 * is initialized.
 * If all threads are busy, additional tasks will wait in a queue until a thread
 * becomes available.

 * Cached Thread Pool
 * A cached thread pool creates new threads as needed and reuses previously
 * constructed threads when they are available. If a thread is idle for 60 seconds,
 * it is terminated.
 *
 *
 * Single Thread Pool
    Description: A single thread pool uses a single worker thread to execute tasks. If that thread is busy,
    additional tasks will wait in a queue until the thread is available.
    Use Case: Useful for tasks that need to be executed sequentially,
    ensuring that only one task is processed at a time.
 *
 * Scheduled Thread Pool*/
     /**   what is Executors class
     * The Executors class provides factory methods to create various types of thread pools
     * or executor services, making it easier to manage the execution of tasks without manually
     * managing thread
     * */

}
