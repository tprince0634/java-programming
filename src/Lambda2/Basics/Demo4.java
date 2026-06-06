package Lambda2.Basics;

public class Demo4 {
    public static void main(String[] args) {

        Thread thread = new Thread(() ->{
            System.out.println("Hello, World!");
            System.out.println("This is a lambda expression.");
        });


        thread.start();
    }
}
