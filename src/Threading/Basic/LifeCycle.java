package Threading.Basic;

public class LifeCycle extends Thread{
    @Override
    public void run() {
        System.out.println("Running");
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LifeCycle lifeCycle = new LifeCycle();  //new state
        System.out.println(lifeCycle.getState());

        lifeCycle.start();   //Runnable state
        System.out.println(lifeCycle.getState());

        lifeCycle.sleep(1000);         // Calling .start() on a thread doesn’t stop the main thread. It continues to run the rest of the code in main()
        System.out.println(lifeCycle.getState());  //T1 is sleeping so  TIMED_WAITING state
        System.out.println(Thread.currentThread().getName());

        lifeCycle.join();
        System.out.println(lifeCycle.getState());


    }
}
