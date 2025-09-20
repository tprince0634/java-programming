package Threading.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class P {

    public static void main(String[] args) {
        long starttime, endtime;

        // --- Single Thread Executor ---
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        starttime = System.currentTimeMillis();

        for (int i = 1; i < 50; i++) {
            int finalI = i;
            singleThreadExecutor.execute(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        singleThreadExecutor.shutdown(); // No more tasks will be submitted

        try {
            singleThreadExecutor.awaitTermination(1, TimeUnit.SECONDS);                // Wait for task to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endtime = System.currentTimeMillis();
        long totaltime1 = endtime - starttime;
        System.out.println("Single-thread executor time: " + totaltime1 + " ms");




        // --- Fixed Thread Pool Executor (3 threads) ---
        ExecutorService fixedThreadExecutor = Executors.newFixedThreadPool(3);
        starttime = System.currentTimeMillis();

        for (int i = 1; i < 50; i++) {
            int finalI = i;
            fixedThreadExecutor.execute(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }

        fixedThreadExecutor.shutdown(); // No more tasks will be submitted

        try {
            fixedThreadExecutor.awaitTermination(5, TimeUnit.SECONDS); // Wait for all tasks to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        endtime = System.currentTimeMillis();
        long totaltime2 = endtime - starttime;
        System.out.println("Fixed-thread executor time: " + totaltime2 + " ms");
    }
}
