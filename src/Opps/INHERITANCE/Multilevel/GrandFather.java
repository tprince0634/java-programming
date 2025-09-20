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



// Subclass
class Child extends Father2 {
    void displayChild() {
        System.out.println("This is Child.");
    }

    public static void main(String[] args) {

        Child obj = new Child();
        obj.displayGrandfather();    // inherited method
        obj.displayFather();         // inherited method
        obj.displayChild();          // specific to Dog class
    }
}
