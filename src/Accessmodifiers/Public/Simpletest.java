package Accessmodifiers.Public;

public class Simpletest {
    public static void main(String[] args) {
        Simple obj = new Simple();
        System.out.println(obj.x);    // Accessible from outside the class
        obj.myMethod();               // Accessible from outside the class
    }
}
