package ThreadingByAman.Basic;

public class DaemonThreadExample {
    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            while (true){
                System.out.println("Running");
            }
        });

        thread.setDaemon(true);          // Set as daemon BEFORE starting
        thread.start();                 // Start the daemon thread

        System.out.println("Finish");
        // JVM will exit soon after this line, killing the daemon thread
    }
}
