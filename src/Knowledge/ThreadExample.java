package Knowledge;
public class ThreadExample {


/**
 *
 * ------------------------------------------------------------------------------------------------
 *    Anonymous Thread
 *
 *    Thread Thread1 = new Thread(new Runnable() {
 *             @Override
 *             public void run() {
 *                 bb.deposit(600);
 *             }
 *         },"Thread1");
 *
 *          Thread1.start();
 *
 *
 *-----------------------------------------------------------------------------------------------------
 *  Anonymous Thread
 *
 *  public static void main(String[] args) {
 *         Cp2 count2 = new Cp2();
 *
 *         Runnable runnable= new Runnable() {
 *             @Override
 *             public void run() {
 *                 for (int i = 0; i < 1000; i++) {
 *                    count2.increment();
 *                 }
 *             }
 *         };
 *
 *         Thread thread= new Thread(runnable);
 *         Thread thread1 = new Thread(runnable);
 *         thread.start();
 *         thread1.start();
 *
 *
 *
 *-------------------------------------------------------------------------------------------------
 *
 * package Multi_Threading.Synchro;
 *
 * public class Counter {
 *     private int count = 0;
 *
 *     // Synchronized method to ensure thread safety
 *     public synchronized  void increment() {
 *         count++;
 *     }
 *
 *     public int getCount() {
 *         return count;
 *     }
 * }
 *
 * class CounterThread extends Thread {
 *     private Counter count;  // Reference to Counter

 *
 *     @Override
 *     public void run() {
 *         for (int i = 0; i < 1000; i++) {
 *             count.increment();
 *         }
 *     }
 * }
 *
 *
 * class Ned {
 *     public static void main(String[] args) {
 *         Counter count = new Counter();
 *
 *         // Create multiple threads that will increment the counter
 *         CounterThread thread1 = new CounterThread(count);
 *         CounterThread thread2 = new CounterThread(count);
 *         CounterThread thread3 = new CounterThread(count);
 *
 *         // Start the threads
 *         thread1.start();
 *         thread2.start();
 *         thread3.start();
 *
 *
//----------------------------------------------------------------------------------------------------------
public class World2 implements Runnable{
        @Override
   public void run() {
     for(; ; ) {
    System.out.println(Thread.currentThread().getName() + " " + "World2");
    }

  World2 w = new World2();
  Thread t1 = new Thread(w);
  t1.start();
   for (; ; ) {
  System.out.println(Thread.currentThread().getName() + " " + "Hello");
}






 *--------------------------------------------------------------------------------------------------
lambda Thread

Thread thread2 = new Thread(() ->{
    for(int i=0;i<1000;i++){
           leo.put(i,"Thread2");
}
});
//------------------------------------------------------------------------------------------------------------


 */
    }


