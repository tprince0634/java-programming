package Accessmodifiers.Protected;


//Allowed within same package
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}
