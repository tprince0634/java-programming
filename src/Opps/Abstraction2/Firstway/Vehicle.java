package Opps.Abstraction2.Firstway;

abstract class Vehicle {
    String name;

    abstract public void Model();
    abstract public void Price();


//    constructor 1        we can not create object of ABSTRACT CLASS SO WE Can Initialize this constructor from subclass with the help of (Super keyword)

    Vehicle(String name) {
        this.name = name;
        System.out.println ("Name of the Vehilce is : " + " " +  name);
    }
}


class Tata extends Vehicle{
    Tata(){
        super("Mahindra");
        System.out.println("Successfully called constructor 1 from abstraction class" );
    }

    public void Model(){
        System.out.println("Model : Thar");
    }
    public void Price(){
        System.out.println(" Price : 5500000");
    }
}

class Thar{
    public static void main(String[] args) {
        Tata nobeltata = new Tata();
        nobeltata.Model();
        nobeltata.Price();
    }
}