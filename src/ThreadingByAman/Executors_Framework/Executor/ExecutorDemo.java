package ThreadingByAman.Executors_Framework.Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(1);

        executor.execute(() -> System.out.println("Task 1 running"));
        executor.execute(() -> System.out.println("Task 2 running"));
    }
}
