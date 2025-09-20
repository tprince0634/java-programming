package ThreadingByAman.VirtualThread.ByArray;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        int totalTasks = 100000;             // Use smaller number to avoid too many threads
        Thread[] threads = new Thread[totalTasks];

        for (int i = 0; i < totalTasks; i++) {
            int taskId = i;
            threads[i] = new Thread(() -> {
                try {
                    Thread.sleep(100);
                    System.out.println("Task " + taskId + " executed by " + Thread.currentThread());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            threads[i].start();
        }

    }
}


/*What can you do to avoid this?
1. Use Java Virtual Threads (Project Loom) — introduced in Java 19+ as preview, stable in Java 21
Virtual threads are lightweight threads managed by the JVM, not OS.

They consume far fewer resources.

You can create hundreds of thousands or even millions of virtual threads without OutOfMemoryError.*/



