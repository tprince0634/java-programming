package Innerclass;

public class Outer {
    String name = "Outer";

    void display() {
        System.out.println("This is a outer class");
    }

    class Inner{
        String name = "Inner";

        void display(){
            System.out.println("This is a  Inner class");
        }

        void outeraccess(){
            System.out.println("The name is :" + Outer.this.name);
        }

 }



    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.name);
        outer.display();

       Outer.Inner inner = outer.new Inner();
       System.out.println(inner.name);
       inner.display();
       inner.outeraccess();





    }
}
