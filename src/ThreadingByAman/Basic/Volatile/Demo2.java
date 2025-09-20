package ThreadingByAman.Basic.Volatile;

public class Demo2 {
    private volatile   boolean running = true;

    public void show(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 0 started");
                while (running){

                }
                System.out.println("Running Stopped");
            }
        });
        thread.start();

        try {
            Thread.sleep(1000);               // main thread sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        running = false;
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.show();

    }
}
