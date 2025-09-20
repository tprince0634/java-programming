package Opps.INHERITANCE.Hierachical;



// Parent class
public class Hierarchical {
    void open() {
        System.out.println("OPEN THE DOOR");
    }
}

// Child class Son that extends Hierarchical
class Son extends Hierarchical {
    void open1() {
        System.out.println("I want to go");
    }
}


// Child class Father that extends Hierarchical
class Father extends Hierarchical {
    // Method specific to Father
    void open2() {
        System.out.println("I want to come ");
    }


    public static void main(String[] args) {
        Father obj = new Father();
        obj.open();
        obj.open2();


        Son obj2 = new Son();
        obj2.open();
        obj2.open1();


    }
}