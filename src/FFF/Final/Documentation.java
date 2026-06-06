package FFF.Final;

/*
========================================================
            FINAL KEYWORD IN JAVA
========================================================
The 'final' keyword in Java is used to apply restrictions.

It can be used with:
1. Variables  → value cannot be changed
2. Methods    → method cannot be overridden
3. Classes    → class cannot be inherited

Purpose:
- To make values constant
- To prevent method overriding
- To prevent inheritance
- To improve security and immutability
========================================================
*/

/**
 * This class explains the usage of the 'final' keyword in Java
 * in a simple and easy-to-understand way.
 */
public class Documentation {

    /* ========================================================
       1️⃣ FINAL VARIABLE
       ======================================================== */

    /**
     * A variable declared as 'final' becomes a constant.
     * Once a value is assigned, it cannot be changed.
     *
     * Initialization rules:
     * - At the time of declaration
     * - Inside the constructor (for instance variables)
     *
     * Note:
     * If a final variable holds an object reference,
     * the reference cannot change, but the object data can.
     */

    final int MAX = 100;   // constant value

    /* ========================================================
       2️⃣ FINAL INSTANCE VARIABLE
       ======================================================== */

    /**
     * A final instance variable that is not initialized
     * at declaration time is called a "blank final variable".
     *
     * A blank final variable MUST be initialized in:
     * 1) Constructor
     */

    final int id;

    // Constructor initializing blank final variable
    Documentation() {
        id = 10;
    }

    /* ========================================================
       3️⃣ FINAL STATIC VARIABLE
       ======================================================== */

    /**
     * A final static variable belongs to the class.
     * It must be initialized:
     * - at declaration OR
     * - inside a static block
     *
     * It is commonly used to define constants.
     */

    static final String COMPANY;

    static {
        COMPANY = "OpenAI";
    }

    /* ========================================================
       4️⃣ FINAL METHOD
       ======================================================== */

    /**
     * A method declared as 'final' cannot be overridden
     * by child classes.
     *
     * This helps in protecting the method implementation.
     */

    final void show() {
        System.out.println("This is a final method");
    }

    /* ========================================================
       5️⃣ FINAL CLASS
       ======================================================== */

    /**
     * A class declared as 'final' cannot be inherited.
     *
     * Example:
     * final class A { }
     * class B extends A { }  // ❌ Error
     *
     * Final classes are often used for:
     * - Security
     * - Immutability
     */
}
