package ThreadingByAman.Basic.Synchronized.waytwo;

import java.util.concurrent.Callable;

public class Counter {
    private  int count;

    public void increment(){        //only shared resource is locked
        synchronized (this){
            count++;
        }

    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
       Counter counter = new Counter();

       Thread thread = new Thread(new Runnable() {
           @Override
           public void run() {
               for(int i=1;i<=5000;i++){
                   counter.increment();
               }
           }
       });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=5000;i++){
                    counter.increment();
                }
            }
        });
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
       System.out.println(counter.getCount());
    }
}
