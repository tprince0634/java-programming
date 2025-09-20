package Accessmodifier2.Public;
import Accessmodifiers.Public.Simple;      //By importing  package

public class Test {
    public static void main(String[] args) {
        Simple s = new Simple();
        System.out.println(s.x);    //Accessing the public variable from another package
        s.myMethod();       //Accessing Public method also from different package as well

//        s.x=89;
//        System.out.println(s.x);
    }
}
