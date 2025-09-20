package Generic2.Bounded.MultipleBounds;

interface Flyer {
    void fly();
}

interface Swimmer {
    void swim();
}
class Animal{
    public void eat(){
        System.out.println("Eating");
    }
}
class Duck extends Animal  implements Flyer,Swimmer{
    @Override
    public void eat() {
        System.out.println("Duck Also Eating");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }
}
public class GenericExample<T extends Animal & Flyer & Swimmer >{
    private T name;

    GenericExample(T name){
        this.name=name;
    }

    public T getName() {
        return name;
    }
    public void showAbilities() {
         name.eat();
         name.fly();
         name.swim();
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        GenericExample<Duck> genericExample = new GenericExample<>(duck);
        genericExample.showAbilities();

    }
}


/*
Is It Possible to Declared a Multiple Bounded Type Parameter?

Yes, it is possible to declare a multiple bounded type parameter in Java generics.
To declare a type parameter with multiple bounds, you use the & symbol to separate the bounds.

In this example:
T is a type parameter that is bounded by Animal, Flyer, and Swimmer.
Any type argument passed to GenericExample must be a subclass of Animal and must implement both Flyer and Swimmer.*/