package ThreadingByAman.Executors_Framework.ExecutorService.TerminationMethods;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownNowExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);  // Simulate work
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " was interrupted!");
                }

            });
        }

        // 3. Gracefully shut down executor
        executor.shutdownNow();  // No new tasks will be accepted
        System.out.println("Executor shutdown initiated...");

    }
}
