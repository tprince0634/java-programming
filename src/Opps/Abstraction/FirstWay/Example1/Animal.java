package Opps.Abstraction.FirstWay.Example1;

// ABSTRACT CLASS
public abstract class Animal {

    // 1. Private variable (data hiding)
    private String name;

    // 2. Constructor in abstract class (allowed)
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    //static method is Allow not variable
    static void show(){
        System.out.println("h");
    }

    // 3. Abstract method (no body)
    public abstract void sound();

    // 4. Concrete method (has body)
    public void sleep() {
        System.out.println(name + " is sleeping ZZZZ");
    }

    // 5. Getter method to access private variable
    public String getName() {
        return name;
    }

}
