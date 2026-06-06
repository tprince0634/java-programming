package Super.Constructor;

class A {
//    no-argument constructor
    A(){
        System.out.println("Parent Constructor");
    }
}

class B extends  A{
    B(){
//  super();        // JVM ADD implicitly
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}

//Here the Java Its self automatically calls the parent constructor
// without using super keyword cause parent constructor is no-argument constructor