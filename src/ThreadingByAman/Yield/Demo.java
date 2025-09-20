package ThreadingByAman.Yield;
/*. Generally, Thread.yield() is used in scenarios where a thread needs to wait for some
condition but doesn't want to block completely (like with sleep() or wait()),
allowing other threads a chance to run. */

public class Demo {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            for(int i=1;i<=10;i++){
                System.out.println("YieldingThread " + i);
                Thread.yield();
            }
        });

        Thread thread2 = new Thread(() ->{
            for(int i=1;i<=10;i++){
                System.out.println(" NonYieldingThread " + i);
            }
        });

        thread.start();
        thread2.start();
    }
}
