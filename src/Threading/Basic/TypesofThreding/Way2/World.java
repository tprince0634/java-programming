package Threading.Basic.TypesofThreding.Way2;

public class World implements Runnable {

    @Override
    public void run() {
        for(; ; ){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
