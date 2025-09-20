package ThreadingByAman.Executors_Framework.ExecutorService;

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = (() ->{
            return "Callable result";
        });

        Future<String> submit = executorService.submit(callable);
        String s = submit.get();
        System.out.println(s);


    }
}
