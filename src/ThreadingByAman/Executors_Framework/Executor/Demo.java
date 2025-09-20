package ThreadingByAman.Executors_Framework.Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(1);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is a Runnable Interface");
            }
        };
        executor.execute(runnable);



    }
}
