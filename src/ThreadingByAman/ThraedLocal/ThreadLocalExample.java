package ThreadingByAman.ThraedLocal;
import Knowledge.ThreadExample;


public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<Long> userthread = new ThreadLocal<>();

        Long userid = 1234L;
        Long userid2 = 5678l;


        Thread thread = new Thread(() ->{
            System.out.println("Started thread for " + userid);
            userthread.set(userid);
            System.out.println("Complete logic for " + userthread.get());
            userthread.remove();
            System.out.println("Removed " + userid);
        });


        Thread thread2 = new Thread(() ->{
            System.out.println("Started thread for " + userid2);
            userthread.set(userid);
            System.out.println("Complete logic for " + userthread.get());
            userthread.remove();
            System.out.println("Removed " + userid2);
        });

        thread.start();
        thread2.start();




    }
}
