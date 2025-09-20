package ThreadingByAman.Executors_Framework.ExecutorService;

import java.util.concurrent.*;

public class Demo4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

// Callable submit open hoga
        Callable<String> callable = () -> "Hello ";
        Future<String> submit = executorService.submit(callable);
        String s = submit.get();
        System.out.println(s);


//runnable submit open hoga
        Future<?> future = executorService.submit(() -> System.out.println("Hello"));
        System.out.println(future.get());
        boolean done = future.isDone();
        System.out.println(done);



        //this submits (result) is used to return something after task completion cause runnable do not return anything
        Future<String> submit1 = executorService.submit(() -> System.out.println("Prince"), "Successfull");
        String s1 = submit1.get();
        System.out.println(s1);


    }
}
