package ThreadingByAman.Executors_Framework.ExecutorService;

import java.util.concurrent.*;

public class CancelExample1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task = () -> {
            Thread.sleep(3000);
             return "Task Completed";
        };

        Future<String> future = executor.submit(task);

//       System.out.println(future.get());   //blocks the current thread (main thread) until the task finishes.
        // Cancel the task before it starts running
        boolean cancelled = future.cancel(true);
//        System.out.println(Thread.currentThread().getName());

        System.out.println("Cancelled: " + cancelled);         // true
       System.out.println("Is Cancelled: " + future.isCancelled()); // true

        executor.shutdown();
    }
}


// cancel(false) only cancels the task if it has NOT started.
// If the task is running, the thread executing it will be interrupted (if possible).