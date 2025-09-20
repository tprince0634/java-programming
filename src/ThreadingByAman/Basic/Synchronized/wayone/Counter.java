package ThreadingByAman.Basic.Synchronized.wayone;

public class Counter {
    private int count;

    public synchronized void increment() {        //whole method is synchronized
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5000; i++) {
                counter.increment();
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5000; i++) {
                counter.increment();
            }
        });
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();

        System.out.println(counter.getCount());  // Always prints 10000
    }
}
