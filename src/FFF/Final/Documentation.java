package FFF.Final;

/*
========================================================
    FINAL KEYWORD DOCUMENTATION
========================================================
This class explains the use of the 'final' keyword in Java:

- Final Variable: Value cannot be changed after initialization.
- Final Instance Variable: Must be initialized at declaration, constructor, or instance block.
- Final Static Variable: Must be initialized at declaration or static block.
- Final Method: Cannot be overridden in subclasses.
- Final Class: Cannot be extended (no inheritance allowed).

Purpose:
Helps in making values constant, securing methods from being overridden,
and preventing inheritance for immutability and security.
========================================================
*/

/**
 * Documentation on the usage of the 'final' keyword in Java.
 */
public class Documentation {

    // FINAL VARIABLE
    /**
     * A variable declared with the 'final' keyword is a constant, meaning its value
     * cannot be changed once initialized. It must be initialized either:
     * - at the time of declaration
     * - or inside the constructor (for instance variables).
     *
     * If the variable holds a reference to an object, the reference cannot be changed,
     * but the object's internal state can be modified.
     *
     * It is commonly used to declare constants in a program.
     */

    // FINAL INSTANCE VARIABLE (Refer to Example.java)
    /**
     * If a final instance variable is not initialized at the time of declaration,
     * it becomes a 'blank final variable'.
     *
     * A blank final variable can only be initialized in:
     * 1) An instance initialization block
     * 2) The constructor
     * 3) At the point of declaration
     */

    // FINAL STATIC VARIABLE (Refer to Apple.java)
    /**
     * A final static variable must be initialized either:
     * - at the time of declaration
     * - or inside a static initialization block.
     */




/* FINAL METHOD (Refer to Telusko.java)
     A   method declared as 'final' cannot be overridden by subclasses.
     This is useful to prevent modification of the method behavior in derived classes.
*/



/*     FINAL CLASS (Refer to Harry.java)
       A class declared as 'final' cannot be extended (subclassed).
       This is useful for creating immutable classes or to prevent inheritance
       for security and design reasons.
*/
}
