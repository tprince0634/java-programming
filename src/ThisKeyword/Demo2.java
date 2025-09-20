package ThisKeyword;

import Copyconstructor.Demo;

public class Demo2 {
    String name;
    int age;

    //Default Constructor
    Demo2(){
        this(5);
        System.out.println("Default");
    }

    //parameterized Constructor With 1 Value
    Demo2(String  name){
        this.name = name;
        System.out.println ("Parameterized 1");
    }

    // //parameterized Constructor With 1 Value
    Demo2(int age){
        this("Kiran");
        this.age=age;
        System.out.println ("Parameterized 2");
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();

    }
}
