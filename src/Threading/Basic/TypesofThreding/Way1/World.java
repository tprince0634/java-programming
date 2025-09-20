package Threading.Basic.TypesofThreding.Way1;

public class World extends Thread {
    @Override
    public void run() {
        for (; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
