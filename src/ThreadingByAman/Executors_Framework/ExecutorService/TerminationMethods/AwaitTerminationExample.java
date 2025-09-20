package ThreadingByAman.Executors_Framework.ExecutorService.TerminationMethods;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample {
    public static void main(String[] args) throws InterruptedException {
        // 1. Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // 2. Submit some tasks
        for (int i = 1; i <= 3; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " started on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);  // Simulate task taking 2 seconds
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " was interrupted.");
                }

            });
        }

        // 3. Initiate shutdown
        executor.shutdown();
        System.out.println("Shutdown initiated...");



        // 4. Wait for up to 5 seconds for tasks to finish
        boolean b = executor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println(b);


//        try {
//            if (executor.awaitTermination(5, TimeUnit.SECONDS)) {
//                System.out.println("All tasks completed within timeout.");
//            } else {
//                System.out.println("Timeout reached before all tasks finished.");
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Main thread was interrupted during awaitTermination.");
//        }


        System.out.println("Main thread exits.");
    }
}
