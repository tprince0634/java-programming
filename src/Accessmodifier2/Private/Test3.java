package Accessmodifier2.Private;
//This is example of private field

import Accessmodifiers.Private.Myclass;

public class Test3 {
    public static void main(String[] args) {
        Myclass a = new Myclass();
        System.out.println(a.getA());         //only getter and setter can help u to access from outside the class and package
        System.out.println(a.getB());
    }
}
