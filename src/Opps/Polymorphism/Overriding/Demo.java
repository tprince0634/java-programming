package Opps.Polymorphism.Overriding;
//❌ No, **method overriding is not possible in the same class.
//Inheritance Require
class Animal{
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Dog makes a sound");
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal a = new Animal();     // Reference and object of Animal
        a.sound();

        Dog d = new Dog();          // Reference of Animal, object of Dog (polymorphism)
        d.sound();

    }
}
