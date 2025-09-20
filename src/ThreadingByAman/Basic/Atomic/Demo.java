package ThreadingByAman.Basic.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
    private AtomicInteger count = new AtomicInteger();

    public void increment(){
        count.incrementAndGet();
    }

    //👉 These classes provide atomic methods like:
    //incrementAndGet()
    //decrementAndGet()
    //compareAndSet()

    public int getCount() {
       return  count.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
               for(int i=1;i<=2000;i++){
                   demo.increment();
               }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=2000;i++){
                   demo.increment();
                }
            }
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();
        System.out.println(demo.getCount());

    }
}
