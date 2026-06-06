package Super.Constructor;
/*
* Java automatically inserts super() ONLY when a no-argument parent constructor exists.
If the parent constructor is parameterized, the child must explicitly call super(value)
*  as the first statement.
* */

class C {
    C(int x) {
        System.out.println("Parent constructor: " + x);
    }
}

class D extends C {
    D() {
        super(10); //  Mandatory
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        D d = new D();
    }
}




