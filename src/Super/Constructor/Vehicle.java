package Super.Constructor;

class Vehicle {
    Vehicle() {
        System.out.println("No args constructor");
    }

    Vehicle(int speed) {
        System.out.println("Vehicle speed: " + speed);
    }

    Vehicle(int speed, String Color){
        System.out.println("Vehile speed "+ speed + " and color " + Color);
    }
}

class Car extends  Vehicle{
    Car(){
//      super(50); // Child choose which constructor to be called
        super(50,"Red");
        System.out.println("Car constructor");
    }

    public static void main(String[] args) {
        Car car = new Car();
    }
}


