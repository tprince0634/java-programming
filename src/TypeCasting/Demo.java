package TypeCasting;

public class Demo {
    public static void main(String[] args) {
 //Implicit
        int a = 15;
        double b = a;
        System.out.println(b);

        //byte->short->char->int->long->float->double   (size)

// Explicit
        double c = 20;
        int d = (int) c;
        System.out.println(d);

        //double → float → long → int → char → short → byte  (size)


    }
}
