package ThreadingByAman.Basic.Volatile;

public class Demo {
    public volatile boolean running = true;

    public void  show() throws InterruptedException {

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Started running");
            System.out.println(Thread.currentThread().getName());
            while (running){

            }
            System.out.println("Worker stopped Running ");
        }
    });
    thread.start();   //user thread


       try {
           Thread.sleep(1000);               // main thread sleep
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

         running=false;          //by main thread

}

    public static void main(String[] args) throws InterruptedException {
       Demo demo = new Demo();
       demo.show();
   }
}












/* What the Code Does:
A user thread (Thread-0) runs a loop that continues as long as running is true.
The main thread starts the worker thread, sleeps for 1 second, then sets running = false.
Because running is volatile, the change made by the main thread is immediately visible to the worker thread.
When the worker thread sees running == false, it exits the loop and stops.
*/