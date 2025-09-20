package Threading.Advance.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {

    private  int count =0;

    ReadWriteLock rwl = new ReentrantReadWriteLock();
    Lock readlock = rwl.readLock();
    Lock writelock = rwl.writeLock();

    public void  increment(){
        writelock.lock();
        try{
            count++;
        }finally {
            writelock.unlock();
        }
    }

    public int getCount() {
        readlock.lock();
        try{
            return count;
        }finally {
            readlock.unlock();
        }
    }



    public static void main(String[] args) {
        ReadWriteLockDemo rd = new ReadWriteLockDemo();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName() + "Reading" + rd.getCount());
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName() + "Reading" + rd.getCount());
                }
            }
        });



        //writerthread
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    rd.increment();
                    System.out.println(Thread.currentThread().getName()+ "Incremented");
                }
            }
        };

      Thread thread1 = new Thread(runnable);


      thread.start();
      thread1.start();
      thread2.start();




        try {
            thread.join();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(Thread.currentThread().getName()+ rd.count);



    }
}



//🔑 Conclusion:
//ReadWriteLock is more efficient than Lock when:
//
//You have many threads reading and
//
//Few threads writing.
//
//It allows concurrent reading, which boosts performance.
//
//Writers still get exclusive access, so data integrity is preserved.