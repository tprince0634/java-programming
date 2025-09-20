package ThreadingByAman.Basic.WhentouseWhich;

public class Document {
    /*
     🔹 1. Multiple Inheritance Allowed?
      ❌ extends Thread — You cannot extend another class:

      class Parent { }
      class MyThread extends Thread , Parent  {  // ❌ Error: Cannot extend two classes
        public void run() {
            System.out.println("Running thread");
        }
      }

✅ implements Runnable — You can extend another class:
class Parent { }
class MyTask extends Parent implements Runnable {
    public void run() {
        System.out.println("Running thread with multiple inheritance");
    }
}


❌ extends Thread — Each thread needs a new object:
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread logic");
    }
}
Thread t1 = new MyThread();
Thread t2 = new MyThread();  // Must create separate object
t1.start();
t2.start();

✅ implements Runnable — Reuse same object:
class MyTask implements Runnable {
    public void run() {
        System.out.println("Runnable logic");
    }
}
MyTask task = new MyTask();  // One object reused
Thread t1 = new Thread(task);
Thread t2 = new Thread(task);
t1.start();
t2.start();

🔹 3. Flexibility (Works with ExecutorService)
import java.util.concurrent.*;
class MyTask implements Runnable {
    public void run() {
        System.out.println("Running with ExecutorService");
    }

ExecutorService executor = Executors.newFixedThreadPool(1);
executor.submit(new MyTask());  // ✅ Works great
executor.shutdown();



🔹 5. Best for Production Use
✅ implements Runnable — Standard in real-world apps:






     */
}



