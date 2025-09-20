package Threading.Basic.TypesofThreding.Way2;

public class Test {
    public static void main(String[] args) {
        World world = new World();
        Thread thread = new Thread(world);
        thread.start();       //It create the new thread and calls the run method
        //thread.run();      //it will only execute the main thread


        for (; ;){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
