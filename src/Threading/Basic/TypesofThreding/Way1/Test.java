package Threading.Basic.TypesofThreding.Way1;
//By Extending the Thread class
public class Test  {
    public static void main(String[] args) {
        World world = new World();
        world.start();

        for (;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
//There is no specific order Random
}
