package ThreadingByAman.Basic.wayone;
//How can we create a Thread in Java?
//You can create a thread instance by either extending the Thread class or implementing the Runnable interface.
// Once you have created a thread instance, you can start it by calling the start() method.

public class Demo  extends  Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.start();

    }
}
