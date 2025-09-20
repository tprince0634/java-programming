package ThreadingByAman.Executors_Framework.ScheludedThreadExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo3 {
    public static void main(String[] args) throws InterruptedException {

        //scheduleAtFixedRate
        ScheduledExecutorService schedule2 = Executors.newScheduledThreadPool(1);
        schedule2.scheduleAtFixedRate(() ->{
            System.out.println("This is scheduleAtFixedRate ");
        },1,2, TimeUnit.SECONDS);

        Thread.sleep(20000);
        schedule2.shutdown();



        //it  will not wait for the above task to get finish
        // Even though the first task is supposed to run after 1 second, your program shuts down the executor and exits before that.


    }
}
