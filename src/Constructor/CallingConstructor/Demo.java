package Constructor.CallingConstructor;

public class Demo {
    String a;
    int b ;
    int c;

    Demo(){
        System.out.println("Default");
    }

    Demo(String a){
        this();
        System.out.println("With one values");
        this.a =a;
    }
    Demo(int b,int c){
        this("Sudikhsha");
        System.out.println("With two vales");
        this.b=b;
        this.c=c;
    }

    public static void main(String[] args) {
        Demo demo3 = new Demo(2,3);

    }
}
