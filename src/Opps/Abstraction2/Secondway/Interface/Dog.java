package Opps.Abstraction2.Secondway.Interface;



interface Animal{
    void sound() ;              //can only contain method without implementation  abstract methods

    // default method (Java 8 and above)
    default void show(){
        System.out.println("This is a default  the Animal interface");
    }

    // Static method (Java 8 and above)
    static void show2(){
        System.out.println("This is satic method");
    }

    // A constant (implicitly public, static, and final)
    int age = 10;



}


public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(Animal.age);   //public static and final
        d.sound();
    }

}

