package StaticMethod;

// Is it possible to override a static method?
// Answer: No — static methods are not overridden, they are hidden.

class Parent {
    int a = 6;

    // Static method in Parent class
    static void display() {
        System.out.println("Parent static method");
    }
}


class Child extends Parent {
    int a = 7;

    // Static method in Child class (hides Parent's static method)
    static void display() {
        System.out.println("Child static method");
    }
}

public class Demo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();  // Output: Parent static method

        Child c = new Child();
        c.display();  // Output: Child static method

        // Static methods are resolved based on the reference type at compile time
        Parent p2 = new Child();
        p2.display();  // Output: Parent static method

        // Variable access is also based on the reference type
        System.out.println(p2.a);  // Output: 6


       /*
       Java does not support variable overriding — only method overriding is allowed.
       Instance variables are resolved statically (i.e., at compile time).
       */

        /*
         * Explanation:
         * - Static methods are resolved at compile time using the reference type (not the object type).
         * - Even though p2 points to a Child object, it is treated as a Parent reference.
         * - Therefore, Parent's static method and variable are used.
         * - This is known as method hiding, not method overriding.
         */
    }
}
