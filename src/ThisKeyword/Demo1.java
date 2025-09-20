package ThisKeyword;

public class Demo1 {
    private int a;
    private  int b;

    public Demo1(int a,int b) {
       this. a = a;          //refers to the instance variable
       this. b = b;
    }

    public void show(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1(4,6);
        demo1.show();
    }
}


