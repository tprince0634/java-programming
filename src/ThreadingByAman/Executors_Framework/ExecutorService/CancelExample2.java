package ThreadingByAman.Executors_Framework.ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CancelExample2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Working...");
                    Thread.sleep(1000);
                }
                return "Finished";
            } catch (InterruptedException e) {
                System.out.println("Task was interrupted!");
                return "Interrupted";
            }
        };
        Future<String> future = executor.submit(task);

        Thread.sleep(2000);   // Let the task run for a bit
        boolean cancelled = future.cancel(true);    // Attempt to interrupt by main

        System.out.println("Cancelled: " + cancelled);
        System.out.println("Is Cancelled: " + future.isCancelled());

        executor.shutdown();
    }
}
