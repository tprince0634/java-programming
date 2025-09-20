package Stream.Basics.Lambda;//package Stream.Basics.Lambda;
//
///**
// *
// * what is lambda function in java
// * A lambda function (or lambda expression) in Java is a short block of code that can take
// in parameters and return a result. It is used primarily to define the implementation of a
// functional interface (an interface with just one abstract method) in a more compact and
// readable way
// .*/

@FunctionalInterface
interface Mathoperation{
    int operate(int a , int b);
}


public class Demo1 implements Mathoperation{
//lambda

    Mathoperation Multiply = (a , b) -> a * b ;

    Mathoperation add =(int a , int b) -> {
        return a+b;
    };

    Mathoperation sub =(int a , int b) -> {
        return a-b;
    };



    public static void main(String[] args) {
        Demo1 l = new Demo1();
        int a =l.add.operate(4,5);
        System.out.println(a);

        int b = l.sub.operate(6,2);
        System.out.println(b);

        int c = l.operate(2,2);
        System.out.println(c);
    }

    @Override
    public int operate(int a, int b) {
        return a*b;
    }


}
