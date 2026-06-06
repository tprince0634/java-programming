package Super.Method;
//✅ Case 2: Parent method overridden (most common use)
class Parent2 {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child2 extends Parent {
    @Override
    void show() {
        System.out.println("Child show()");
        super.show();   // calls parent version
    }


    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.show();
    }
}
