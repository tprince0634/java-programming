package Accessmodifiers.Protected;
//Protected
//same class
//same package
//different package through child class


//Allowed within class

public class Animal {
    protected void sound(){
        System.out.println("Animal makes a sound");
    }
}


// Allowed in subclass also within same package
class Dog extends  Animal{
    void dogsound(){
        sound();
        System.out.println("Dog Barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.dogsound();
    }
}
