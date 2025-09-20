package Constructor.Default;
//Default Constructor
public class Demo {
    int x;
    String a;

    public void showvalue(){
        System.out.println(x);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.showvalue();
    }
}
