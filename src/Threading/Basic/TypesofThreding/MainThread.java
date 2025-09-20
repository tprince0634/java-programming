package Threading.Basic.TypesofThreding;

public class MainThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        //This is Default thread (main) which invoked when u run the program
        //It’s created automatically by the Java Virtual Machine (JVM)

        Thread thread = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        thread.start();

    }
}
