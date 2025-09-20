package ThreadingByAman.Fairness;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairDemo  {
    Lock lock = new ReentrantLock(true);   // the 'true' makes it a **fair** lock

    public void accessresources() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Acquire the lock ");
            Thread.sleep(2000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println( Thread.currentThread().getName() + " Unlock the Lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairDemo fairDemo = new FairDemo();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                fairDemo.accessresources();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();


    }


}
