package MethodHidingDemo;

class Parent {
    int x = 50;
   static void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    int x = 60;
    static void show() {
        System.out.println("Child method");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
        System.out.println(obj.x); // Variable resolves at Compile time
    }
}

//Because:
//show() is static
//Static methods are resolved at compile time
//Compiler checks reference type → Parent