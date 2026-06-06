package Opps.INHERITANCE.Single;

// Parent class
class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}


// Child class inherits from Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}


// Main class
public class SingleInheritanceExample {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
