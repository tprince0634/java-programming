package Opps.INHERITANCE.DaimondSolution.One;

interface A {
    default void  display(){
        System.out.println("This is from Interface A");
    }
}

interface  B extends  A{
    default void  display(){
        System.out.println("This is from Interface B");
    }
}

interface C extends  A {
    default void  display(){
        System.out.println("This is from Interface C");
    }
}

public class Demo implements B , C{
    @Override
    public void display() {
        C.super.display();
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}

/* When a class implements multiple interfaces having the same default method,
it must override the method and explicitly choose which interface’s method
to call using InterfaceName.super.method().*/

