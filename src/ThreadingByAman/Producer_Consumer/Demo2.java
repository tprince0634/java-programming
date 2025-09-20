package ThreadingByAman.Producer_Consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo2 {
    static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
    public static void main(String[] args) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        int data = 1;
                        while (true) {
                            blockingQueue.put(data++);
                            System.out.println("Produced " + (data - 1));
                            Thread.sleep(1000); // Simulate production time
                        }
                    }catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Integer take = blockingQueue.take();
                        System.out.println("Consumed" + take);
                        Thread.sleep(100);
                    }
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

       thread.start();
       thread1.start();

    }
}
