package ThreadingByAman.Semaphore;
import java.util.concurrent.Semaphore;

//As a result, only 2 threads are allowed to access the resource concurrently,
// while other threads wait for a permit to become available.

public class SemaphoeExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for(int i=1;i<=6;i++){
//            String name = "Thread " + i;
            Thread thread = new Thread(() ->{
                try {
                    semaphore.acquire();
                    System.out.println("Acquired " + Thread.currentThread().getName());
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + " released the resource");
                    semaphore.release(); // Release permit
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.start();
//            thread.setName(name);
        }
    }
}
