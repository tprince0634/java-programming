package ThreadingByAman.Executors_Framework.ExecutorService;

import java.util.concurrent.*;

public class Demo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable =(() ->{
           return "Callable";
        });
        Future<String> submit = executorService.submit(callable);
        String s = submit.get();
        System.out.println(s);


        Callable<String> callableTask = () -> {
            return "Callable has finished";
        };
        Future<String> submit1 = executorService.submit(callableTask);
        String s1 = submit1.get();
        System.out.println(s1);


        executorService.submit(() -> {
            System.out.println("This is also a Callable Command");
        });




    }
}
