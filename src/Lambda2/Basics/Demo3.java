package Lambda2.Basics;

public class Demo3 {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () ->{
            System.out.println("Hello, World!");
            System.out.println("This is a lambda expression.");
        };


        Thread thread = new Thread(runnable);
        thread.start();

        thread.join();
        System.out.println("Thread has finished execution.");
    }
}
