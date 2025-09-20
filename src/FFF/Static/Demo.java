package FFF.Static;

public class Demo {
    //Initialization At declaration
    static  int a  = 10 ;

    //values can be changed
    static {
        a=11;
    }


    static  int b;
    // There is only Two way to initialized Through (Static initialized block)
    static {
        b=10;
    }

    public static void main(String[] args) {
        System.out.println(Demo.a);
        System.out.println(Demo.b);

    }
}
