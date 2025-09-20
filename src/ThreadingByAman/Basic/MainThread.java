package ThreadingByAman.Basic;
/* //This is Default thread (main) which invoked when u run the program
  It’s created automatically by the Java Virtual Machine (JVM)*/
public class MainThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MainThread mainThread = new MainThread();
        mainThread.run();
    }


}
