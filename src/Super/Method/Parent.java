package Super.Method;
//✅ Case 1: Parent method NOT overridden (still works)
class Parent {
    void show() {
        System.out.println("Parent method show()");
    }
}

class Child extends Parent {
    void test() {
        super.show();   // ✔ allowed
        System.out.println("Child method test()");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.test();
    }
}
