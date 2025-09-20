package ThreadingByAman.Executors_Framework.ScheludedThreadExecutor;

import java.util.concurrent.*;

public class Demo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        //schedule with callable
        ScheduledFuture<String> schedule = scheduler.schedule(() -> {
            return "Apple after 3 seconds ";
        }, 3, TimeUnit.SECONDS);
        System.out.println(schedule.get());
        scheduler.shutdown();
        //it waits for the above task to get finish until u use  scheduledFixedRate

    }
}
