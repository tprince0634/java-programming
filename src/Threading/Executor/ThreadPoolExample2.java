package Threading.Executor;

import java.util.concurrent.*;

public class ThreadPoolExample2 {

    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with corePoolSize = 2, maxPoolSize = 4, keepAliveTime = 10 seconds
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,                    // core pool size
                4,                    // maximum pool size
                10,                   // keep-alive time
                TimeUnit.SECONDS,     // time unit for keep-alive time
                new LinkedBlockingQueue<Runnable>() // work queue
        );

        // Submit 5 tasks using submit()
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            Future<?> future = executor.submit(() -> {
                System.out.println("Running task " + taskId + " on thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });

            // Optional: Handle task exceptions
            try {
                future.get(); // Waits for the task to complete
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor after tasks are done
        executor.shutdown();
    }
}
