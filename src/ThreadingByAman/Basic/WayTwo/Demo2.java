package ThreadingByAman.Basic.WayTwo;

public class Demo2 implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // Create an instance of Class that implement Runnable
      Demo2 demo2 = new Demo2();
        // Create a Thread instance and pass Instance as a parameter
      Thread thread = new Thread(demo2);
      thread.start();
    }
}
