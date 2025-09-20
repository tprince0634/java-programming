package Generic2.Basics.GenericMethod;
/**
 *      public <T> void methodName(T parameter) {
 *              // method body
 *        }
 * */

public class Demo {

    //Generic method
    public <T> void Show(T name){
        System.out.println(name);
    }

    //Without Generic Method
    public void show2( String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.Show("Rohit");
        d.Show(56);
//      d.show2(5);

    }
}
