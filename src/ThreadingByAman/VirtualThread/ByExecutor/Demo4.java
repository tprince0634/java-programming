package ThreadingByAman.VirtualThread.ByExecutor;
//Main thread exits.
//Because virtual threads are daemon threads, the JVM shuts down immediately, killing any still-running virtual threads.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo4 {
    static ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 1000000; i++) {
            int taskId = i;
            executor.submit(() -> {
                try {
                    Thread.sleep(100);  // Simulate blocking
                    System.out.println("Task " + taskId + " executed by " + Thread.currentThread());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown(); // Stop accepting new tasks
        System.out.println(executor.awaitTermination(1,TimeUnit.SECONDS));
//        To gracefully wait for your thread pool to finish its work before exiting the main thread or JVM.


//        try {
//            if (executor.awaitTermination(3, TimeUnit.SECONDS)) {
//                System.out.println("All tasks completed within timeout.");
//            } else {
//                System.out.println("Timeout reached before all tasks finished.");
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Main thread was interrupted during awaitTermination.");
//        }
//        System.out.println("All tasks completed or timeout reached.");
    }
}
