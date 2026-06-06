package Opps.Abstraction.Interface;

// Interface
interface Animal {

    // Abstract method → MUST implement
    void sound();

    // Default method → optional to override
    default void show() {
        System.out.println("Default method from Animal");
    }

    // Static method → cannot override
    static void show2() {
        System.out.println("Static method from Animal");
    }

    // Constant
    int AGE = 10;
}


// Class implementing interface
public class Dog implements Animal {

    // MUST implement abstract method
    @Override
    public void sound() {
        System.out.println("Dog says: Woof");
    }

    // OPTIONAL: overriding default method
    @Override
    public void show() {
        System.out.println("Dog custom show method");
    }

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();   // implemented method
        d.show();    // overridden default method

        System.out.println("Age: " + Animal.AGE);  // constant
        Animal.show2(); // static method (called using interface)
    }
}