package Opps.Abstraction.FirstWay.Example1;

// CONCRETE CLASS (Subclass)
public class Dog extends Animal {

    // 7. Subclass constructor must call super()
    Dog(String name) {
        super(name);
        System.out.println("Dog constructor called");
    }

    // 8. Must override abstract method
    @Override
    public void sound() {
        System.out.println(getName() + " says: Bark Bark");
    }

    public static void main(String[] args) {

        // 9. Cannot create Animal object directly ❌
        // Animal a = new Animal(); // ERROR

        // 10. Create Dog object using Animal reference (Abstraction)
        Animal a = new Dog("Lalu");

        a.sleep();
        a.sound();

        show();



    }
}
