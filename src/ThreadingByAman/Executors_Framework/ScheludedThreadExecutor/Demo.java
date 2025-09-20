package ThreadingByAman.Executors_Framework.ScheludedThreadExecutor;
import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        //schedule with  Runnable
        scheduler.schedule(() -> {
            System.out.println("Runs after 2 seconds");
        }, 2, TimeUnit.SECONDS);

    }
}
