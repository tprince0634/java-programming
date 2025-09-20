package Threading.Basic.Methods;
// join()	Waits for another thread to finish before continuing.
// getName()	Returns the thread’s name.

public class M3 extends Thread{
    @Override
    public void run() {
       try{
           Thread.sleep(2000);
           System.out.println(Thread.currentThread().getName());
       }catch (InterruptedException e){
           System.out.println(e);
       }
    }

    public static void main(String[] args) throws InterruptedException {
        M3 m3 = new M3();
        m3.start();
        m3.join();
        System.out.println("Execute After Thread finihsed");
    }
}
