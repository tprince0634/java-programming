package D;
class Engine{
    public void start(){
        System.out.println("engine start");
    }
}

public class Car {
    
    Engine engine ;
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("DRIVING");
    }

    public static void main(String[] args) {
        Engine engine1 = new Engine();
        Car car = new Car(engine1);
        car.drive();
    }
}
