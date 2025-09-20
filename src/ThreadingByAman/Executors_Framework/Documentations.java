package ThreadingByAman.Executors_Framework;

public class Documentations {

    /* what is Framework
    /* A framework is a reusable, pre-written set of tools, code, and rules
       that provides a structured way to build software.
       Provides a "skeleton" or template for your code
       A framework is like a house blueprint
       You can build your own rooms and decorate it, but the foundation, plumbing,
       and layout are already provided. */

    /* what is Executors Framework in java
       The Executors Framework is a high-level concurrency utility in Java,
       which is a part of the java.util.concurrent package,
       designed to simplify the creation, management, and control of threads and thread pools.

   /* What is it exactly?
      Instead of manually creating and managing threads using the Thread class,
      the Executors Framework provides a pool of threads to execute tasks asynchronously,
      efficiently reusing threads, and managing their lifecycle automatically.*/


    /* What is Thread Pool
    /*   A thread pool is a collection of pre-initialized threads that are available
         for executing tasks.
         Instead of creating a new thread for each task,
         a thread pool reuses  existing threads, which can improve performance and resource management
     */

    //Benefits
    //Reduce overhead of managing lifecycle of thread
    //Creation time can be saved by Reusing The Thread (Reusing)
    //Increase Performance
    //Reduce Error

//     Types of ThreadPool


   /*  Fixed Thread Pool
       Description: A fixed thread pool has a fixed number of threads that are created when the pool is initialized.
       If all threads are busy, additional tasks will wait in a queue until a thread  becomes available.

   / * Single Thread Pool
       Description: A single thread pool uses a single worker thread to execute tasks. If that thread is busy,
       additional tasks will wait in a queue until the thread is available.
       Use Case: Useful for tasks that need to be executed sequentially,
       ensuring that only one task is processed at a time.


  /*  CachedThreadPool
       It is a thread pool that creates new threads as needed and reuses previously constructed threads
       when they are available. Idle threads are terminated if they remain unused for 60 seconds.
       It is suitable for executing many short-lived asynchronous tasks.


🧠 How It Works (Simplified)
You submit a task.
If a thread is idle, it runs the task.
If no idle thread, a new thread is created.
If a thread is idle for 60s, it's removed.

//is handled by the ThreadPoolExecutor class,
which is the internal implementation behind Executors.newCachedThreadPool().
*/

   /* ScheduledThreadPool
      It is a thread pool that can schedule tasks to run after a delay or periodically.
      It is useful for tasks that need to be executed at fixed intervals or after a certain time delay.*/
     //executing tasks at a specific time or with a fixed delay between executions



//    Interfaces  ...........................
    /* Executor: It is a simple interface in Java that provides a way to
       decouple task submission from task execution.
       It defines a single method, execute(Runnable command),
       which executes the given command in a thread pool.

       (it only accepts runnable command)
       Execute submitted Runnable tasks asynchronously.
       (Runnable is for tasks with no return value)

       A Runnable command is an object that implements the Runnable interface in Java.
       It's essentially a task that can be executed by a thread but does not return a result
       and cannot throw checked exceptions.


 */


   /* ExecutorService (Interface):  It is a subinterface of Executor that represents a more
      complete version of the Executor also  It allows developers to submit both Runnable and Callable tasks for
      asynchronous execution, where Callable can return a result and throw checked exceptions.
      It supports task submission methods like submit(), which returns a Future object,
      allowing you to monitor the task’s progress, retrieve its result, or even cancel it if needed.
      It also offers robust lifecycle control with methods like shutdown() for graceful termination
      and shutdownNow() for immediate shutdown of the service.

      //shutdown() :Graceful shutdown. It stops accepting new tasks.
                    Already submitted tasks will continue to run until they finish.
                    The executor will terminate only after all active tasks complete.

     //✅ shutdownNow(): Immediate shutdown. Attempts to stop all actively executing tasks.
                         Returns a list of tasks that were submitted but never started.
                         Use this when you want to forcefully shut down the executor right away,
                          even if some tasks are still running.


🔍 What awaitTermination() Does
The method awaitTermination(long timeout, TimeUnit unit) is used to wait for an ExecutorService to fully shut down — that is, for all tasks to finish execution after shutdown() has been called.

🧠 Why It’s Needed
Calling shutdown() does not block — it just starts the shutdown process. So if you immediately check isTerminated(), it might return false because the tasks haven't finished yet.



                          ⚙️ Task Submission Methods
Method Signature	Description
<T> Future<T> submit(Callable<T> task)	Submits a Callable task and returns a Future.
<T> Future<T> submit(Runnable task, T result)	Submits a Runnable and returns a Future with a predefined result.
Future<?> submit(Runnable task)	Submits a Runnable task and returns a Future<?>.
void execute(Runnable command)	Executes a Runnable task (inherited from Executor interface).





    */


















}
