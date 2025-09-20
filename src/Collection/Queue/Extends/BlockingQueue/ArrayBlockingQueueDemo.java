package Collection.Queue.Extends.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//        Producer
        class Producer implements Runnable{
            private  BlockingQueue<Integer> queue;
            private int value =0;

            //Constructor
            public Producer( BlockingQueue<Integer> queue){
                this.queue=queue;
            }

            @Override
            public void run() {
                while (true){
                    System.out.println("Producer Produced" + value);
                    try{
                        queue.put(value++);
                        Thread.sleep(500);
                    }catch (Exception e ){
                        Thread.currentThread().interrupt();
                        System.out.println("Producer interrupted");
                    }

                }

            }
        }


//        Consumer
        class Consumer implements Runnable{
            private  BlockingQueue<Integer> queue;

            //Constructor
            public Consumer( BlockingQueue<Integer> queue){
                this.queue=queue;
            }

            @Override
            public void run() {
                while (true){
                    try {
                        Integer value =  queue.take();
                        System.out.println("Consumer Consumed" + value);
                        Thread.sleep(1000);
                    }catch (Exception e ){
                        Thread.currentThread().interrupt();
                        System.out.println("Consumer interrupted");
                    }


                }

            }
        }



public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);  // Bounded Fixed size never change
        //Single Lock
        //back by Circular Array
        //Less memory Head
        //More thread to -->Problem so LinkedBlocking

        //Way 1
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

//        //Way2
//        Thread Producer = new Thread(new Producer(queue));
//        Thread Consumer = new Thread(new Consumer(queue));

        t1.start();
        t2.start();




    }
}

/**
 * Queue Behavior
 * The BlockingQueue (in this case, an ArrayBlockingQueue) has a fixed capacity of 5. This means it can hold up to 5 items at a time.
 * When the producer tries to add an item to the queue and the queue is full, it will block (wait) until space becomes available.
 * When the consumer takes an item from the queue, it frees up space for the producer to add more items.
 * */
