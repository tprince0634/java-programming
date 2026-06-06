
package Opps.Abstraction.Interface;

// Interface
interface Animal2 {
    default void sound() {
        System.out.println("Default sound from Animal2");
    }
}

// Class implementing interface
class Dog2 implements Animal2 {

    // No override here → allowed

    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.sound();   // uses default method
    }
}