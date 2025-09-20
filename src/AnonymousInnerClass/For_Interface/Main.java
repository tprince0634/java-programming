package AnonymousInnerClass.For_Interface;
interface Tea{
    void show();
}
public class Main {
    public static void main(String[] args) {


        //anonymous inner class
        Tea tea = new Tea() {
            @Override
            public void show() {
                System.out.println("Tea from  anonymous inner class");
            }
        };
    }
}
