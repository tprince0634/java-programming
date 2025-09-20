package ThreadingByAman.VirtualThread.ByArray;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        int totalTasks = 100000;
        Thread[] threads = new Thread[totalTasks];

        for (int i = 0; i < totalTasks; i++) {
            int taskId = i;
            threads[i] = Thread.startVirtualThread(() -> {    //you do NOT need to call start() separately.
                try {
                    Thread.sleep(100);
                    System.out.println("Task " + taskId + " executed by " + Thread.currentThread());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Wait for all virtual threads to complete
        //Without joining, your main thread may exit before tasks complete.

        for (Thread t : threads) {
            t.join();
        }

      }
 }
