package PassByValue_Reference;
//pass by value

public class Demo2 {
    public static void main(String[] args) {
        int a = 10;                //original
        System.out.println(a);

        int b;
        b=a;                           //copy of a
        System.out.println(b);
        b=20;                      //changes done to assigned variable do not affect thr original one
        System.out.println(b);
        System.out.println(a);

    }
}
