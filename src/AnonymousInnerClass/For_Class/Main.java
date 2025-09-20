package AnonymousInnerClass.For_Class;
class Animal{
    void show() {
        System.out.println("Outer class");
    }
}
public class Main {
    public static void main(String[] args) {

        //anonymous inner class
        Animal animal = new Animal(){
            @Override
            void show() {
                System.out.println("Inner class");
            }
        };

        animal.show();
    }
}
