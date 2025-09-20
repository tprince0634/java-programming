package Opps.INHERITANCE.DaimondSolution;

interface A{
    default void  display(){
        System.out.println("This is from Interface A");
    }
}



interface  B{
    default void  display(){
        System.out.println("This is from Interface B");
    }

    static void show(){
        System.out.println("This is static method introduced in java 8");
    }

}


public class Demo implements A , B{
    @Override
    public void display() {
        A.super.display();
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}