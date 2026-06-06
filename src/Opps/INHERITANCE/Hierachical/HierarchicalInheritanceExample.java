package Opps.INHERITANCE.Hierachical;
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}


// Child class 1
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}


// Child class 2
class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}


// Main class
public class HierarchicalInheritanceExample {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // own method

        System.out.println();

        Cat c = new Cat();
        c.eat();   // inherited from Animal
        c.meow();  // own method
    }
}

