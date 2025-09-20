package Threading.Basic;

public class DemonThread extends Thread {
    public static void main(String[] args) {

        // Create a daemon thread
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Running from daemon thread");
            }
        });

        daemonThread.setDaemon(true);        // Set as daemon BEFORE starting
        daemonThread.start();                // Start the daemon thread

        System.out.println("Finish");        // Main thread finishes
        // JVM will exit soon after this line, killing the daemon thread
    }
}
