package Opps.INHERITANCE.Multilevel;

// Base class
class Grandfather {
    void displayGrandfather() {
        System.out.println("This is Grandfather.");
    }
}


// Intermediate class
class Father2 extends Grandfather {
    void displayFather() {
        System.out.println("This is Father.");
    }
}

// child class
class Child extends Father2 {
        void displayChild() {
        System.out.println("This is Child.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
       Child child = new Child();
       child.displayGrandfather();
       child.displayFather();
       child.displayChild();

    }


 }

