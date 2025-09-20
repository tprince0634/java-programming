// ❗ This is a DEMONSTRATION of the Diamond Problem using classes.
// ❗ This code will NOT compile in Java because Java does not allow multiple class inheritance.


class A {
    void display() {
        System.out.println("This is from class A");
    }
}

class B extends A {
    @Override
    void display() {
        System.out.println("This is from class B");
    }
}

class C extends A {
    @Override
    void display() {
        System.out.println("This is from class C");
    }
}

// ❌ Java does NOT allow a class to extend both B and C.
// ❌ This will cause a compilation error due to ambiguity.
 /*
public class Demo extends B, C {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();  // ❓ Should it call B's or C's display()? Java can't decide.
    }
}
*/

// ✅ EXPLANATION FOR INTERVIEW:
// This is called the **Diamond Problem**. If class B and C both override a method from A,
// and a subclass (like Demo) inherits from both B and C, then there's ambiguity:
// Should Demo use B's version of `display()` or C's?
// To avoid this, Java allows only **single inheritance for classes**.

