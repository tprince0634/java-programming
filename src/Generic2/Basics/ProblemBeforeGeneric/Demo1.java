package Generic2.Basics.ProblemBeforeGeneric;

public class Demo1 {

    private Object a;

    public void setA(Object a) {
        this.a = a;
    }

    public Object getA() {
        return a;
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
    //     demo1.setA(5);
           demo1.setA("Hello");

        int r = (int) demo1.getA();  //typecasting for int and for string no compile time error
        System.out.println(r);

    }
}

