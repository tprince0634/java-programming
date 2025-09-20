package Innerclass.StaticNestedClass;

import Innerclass.Outer;

public class Outerclass {
     static String  staticname = "Gunja";
     String name = "Chandan";

     void show(){
         System.out.println("Regular void method");
     }

    static void show2(){
        System.out.println(" Static method");
    }

    static  class StaticNestedClass{
        void get(){
            System.out.println(staticname);
//            System.out.println(name);  only static fields is accessable
            show2();

        }
    }

    public static void main(String[] args) {
        Outerclass outerclass = new Outerclass();
        outerclass.show();

        StaticNestedClass ss = new StaticNestedClass();
        ss.get();



    }
}
