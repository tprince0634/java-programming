package Threading;
//For simple task using Thread may take more time

public class Demo {
    public static void main(String[] args) {
        long startTime, endTime;

        // Measure time with threading
        startTime = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println(i);
            }
        });

        thread.start();
        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();
        System.out.println("With Threading: " + (endTime - startTime) + " ms");




        // Measure time without threading
        startTime = System.currentTimeMillis();
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Without Threading: " + (endTime - startTime) + " ms");
    }
}
