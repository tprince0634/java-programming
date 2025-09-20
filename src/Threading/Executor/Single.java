package Threading.Executor;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Single {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Ratan Tata Sir");
            }
        };

        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() ->{
            System.out.println(runnable);
            runnable.run();
        });

    }
}

