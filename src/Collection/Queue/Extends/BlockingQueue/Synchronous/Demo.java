package Collection.Queue.Extends.BlockingQueue.Synchronous;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Demo {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Producer is Trying to put item ..");
                    queue.put("Hello From Producer");
                    System.out.println("Producer: Item put successfully");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println("Consumer: Ready to take item...");
                    String received = queue.take();
                    System.out.println("Consumer Successfully Consumed.." + received);
                }catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        thread.start();
        thread1.start();
    }
}
