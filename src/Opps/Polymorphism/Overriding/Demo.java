package Opps.Polymorphism.Overriding;
//❌ No, **method overriding is not possible in the same class.
//Inheritance Require

class Animal{
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void eat(){
        System.out.println("Animal can eat ");
    }
}

class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Dog makes a sound");
    }
    public void bark(){
        System.out.println("Dog barks");
    }
}


public class Demo {
    public static void main(String[] args) {
        Animal a = new Animal();     // Reference and object of Animal
        a.sound();
        a.eat();

        a = new Dog();          // Reference of Animal, object of Dog (polymorphism)
        a.sound();
        a.eat();
//        a.bark();             ❌ NOT allowed (parent cannot access child)

        Dog b = new Dog();
        b.eat();
        b.bark();



    }
}


/*
Reference type: Animal
        d
        ↓
     Dog object
     ----------
     sound()
     eat()
     bark()
*/