package Collection.Queue.Extends.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();

         queue1.offer(10);
         queue1.offer(20);
         queue1.put(30);
        //inserts immediately  cause unbounded
        // put() will block if the queue is full (not applicable here since it's unbounded)

        System.out.println("Peek: "   +  queue1.poll());
        System.out.println("Take: " + queue1.take());  // 20  Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
        System.out.println("Take: " + queue1.take());  // 30

//        System.out.println(queue1.take());  // ❗ Blocks because queue is now empty
        System.out.println(queue1.poll());

        // If you call take() again here, it would block because the queue is empty
    }
}


