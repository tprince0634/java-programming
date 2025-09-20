package Constructor.Paramaterized;

public class Demo {
    String a ;
    int b ;

    //Parameterized constructor
    Demo(String a, int b){
        this.a=a;
        this.b=b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Demo dd = new Demo("Shivika",59);

    }
}
