package ThreadingByAman.Executors_Framework.ExecutorService;

import java.util.concurrent.*;

public class Demo5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Callable<String> task = (() ->{
            return "PNB";
        });
        Future<String> submit = executor.submit(task);

        Thread.sleep(100);  //it gives time to the executor to start the thread
        boolean cancel = submit.cancel(false);
        System.out.println(submit.get());

        boolean cancelled = submit.isCancelled();
        System.out.println(cancelled);


    }
}
