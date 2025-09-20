package Threading.Basic.Methods;
//start()	Starts the thread — calls the run() method in a new thread.
//run()	Contains the code that the thread will execute — usually overridden.

public class M1  extends  Thread{
    @Override
    public void run() {
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        M1 m1 = new M1();
        m1.start();
    }
}
