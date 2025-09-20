package Opps.Abstraction2.Firstway;
//can have a constructor also

abstract  class Oyy {

    String name;

    Oyy(String name){                            //can have a constructor
        this.name = name;
    }

    abstract void Show();

    static int  age = 15;                       //can have a normal variable

}

public class Demo2 extends Oyy{

    Demo2(String name) {
        super(name);
    }

    @Override
    void Show() {
        System.out.println("This is a overriden from abstract class");
        System.out.println(" This is the name pass through the abstract class constructor : " + name);
   }

    public static void main(String[] args) {
        Demo2 d2 = new Demo2("Prince");
        System.out.println(d2.age);
        d2.Show();
    }

}
