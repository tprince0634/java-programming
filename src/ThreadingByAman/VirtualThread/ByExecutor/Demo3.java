package ThreadingByAman.VirtualThread.ByExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo3 {
    // Create a platform thread pool (100 threads only)
    static  ExecutorService executor = Executors.newFixedThreadPool(100);

    public static void main(String[] args) {
        // Submit 10,000 blocking tasks
        for (int i = 0; i < 10_000; i++) {
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
        executor.shutdown();
        System.out.println("Submitted all tasks");
    }
}






