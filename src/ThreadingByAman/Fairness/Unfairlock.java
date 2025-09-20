package ThreadingByAman.Fairness;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Unfairlock {
//  Lock lock = new ReentrantLock();  // 👈 This is an *unfair* lock by default


    Lock lock = new ReentrantLock();

    public void acquiremethod(){
        lock.lock();
        try{
            System.out.println( Thread.currentThread().getName()+ "Acquire the Lock");
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println( e);
        } finally {
            System.out.println( Thread.currentThread().getName() + "Unlock the Lock");
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        Unfairlock ul = new Unfairlock();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
              ul.acquiremethod();
            }
        });


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ul.acquiremethod();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                ul.acquiremethod();
            }
        });


       thread.start();
       thread1.start();
       thread3.start();

    }
}


/**
 * Lock Type	          Guarantees Order?	    Fast?	          May Cause Starvation?
 * new ReentrantLock()	      ❌ No	            ✅ Fast                      ✅ Possible
 * new ReentrantLock(true)	  ✅ Yes   	        ❌ Slightly slower       	❌ Never*/


























//        try {
//            t1.start();
//            Multi_Threading.Thread.sleep(500);
//            t2.start();
//            Multi_Threading.Thread.sleep(500);
//            t3.start();
//
//        }catch (Exception e){
//            System.out.println(e);
//        }



