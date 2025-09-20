package ThreadingByAman.Executors_Framework.Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Demo2 {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(2);

        //lambda (runnable)
        Runnable runnable = (() -> {
            System.out.println("Using Lambda ");
        });
        executor.execute(runnable);


        //lambda (runnable)
        executor.execute(() ->{
            System.out.println("This is also a Runnable Command using Lambda ");
        });
    }
}
