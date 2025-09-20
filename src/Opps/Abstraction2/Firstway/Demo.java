package Opps.Abstraction2.Firstway;

public  abstract class Demo {
    //abstract method
    abstract void show();

    //concrete method
    void show2(){
        System.out.println("This is a  Concrete method from Abstract class");
    }
}

class  Demosub extends Demo {
    public static void main(String[] args) {
        Demosub  d = new Demosub();
        d.show();
        d.show2();
    }

    @Override
    void show() {
        System.out.println("This is a abstarct method invoked from subclass");
    }

}
