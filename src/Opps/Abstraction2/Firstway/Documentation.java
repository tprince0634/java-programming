package Opps.Abstraction2.Firstway;

public class Documentation {

    /**
     * Abstraction in Java is a fundamental object-oriented programming (OOP) concept.
     * It focuses on hiding complex implementation details and exposing only the essential
     * features of an object or system to the user.
     */


        /**
         * In Java, abstraction can be achieved in two primary ways:
         *
         * 1. Using Abstract Classes
         * 2. Using Interfaces
         */

        /**
         * Abstract Classes:
         * -----------------
         * - An abstract class is a class that cannot be instantiated directly,
         *   meaning you cannot create an object of an abstract class.
         * - It may contain:
         *      a. Abstract methods (methods without a body; end with a semicolon).
         *      b. Concrete methods (methods with a body).
         * - Abstract methods must be implemented by any non-abstract subclass.
         * - Abstract classes can also include:
         *      - Instance variables
         *      - Constructors
         *      - Fully implemented methods (concrete methods)
         *
         * Example:
         * abstract class Animal {
         *     abstract void sound();
         *     void sleep() {
         *         System.out.println("Sleeping...");
         *     }
         * }
         *
         * class Dog extends Animal {
         *     void sound() {
         *         System.out.println("Bark");
         *     }
         * }
         */

        /**
         * Why Can't We Create an Object of an Abstract Class?
         * ----------------------------------------------------
         * - An abstract class may contain abstract methods, which do not have a body.
         * - Instantiating such a class would lead to incomplete behavior since abstract methods
         *   provide no implementation.
         * - Abstract classes are meant to be extended by subclasses that provide implementations
         *   for the abstract methods.
         *
         * Example:
         * abstract class Shape {
         *     abstract void draw();  // No implementation
         * }
         * // Shape s = new Shape(); // This is invalid!
         */

        /**
         * Abstract Variables:
         * -------------------
         * - Java does not support abstract variables.
         * - Variables in abstract classes must be declared like in regular classes.
         * - Only methods can be declared abstract.
         */

        /**
         * Rules of Abstract Classes:
         * --------------------------
         * - An abstract class can have both abstract and concrete methods.
         * - If a class extends an abstract class, it must:
         *     a. Implement all abstract methods from the parent abstract class, OR
         *     b. Be declared abstract itself.
         *
         * - You can have multiple layers of abstraction by chaining abstract classes.
         *   This is useful when intermediate classes only implement part of the abstract methods.
         *
         * Example:
         * abstract class A {
         *     abstract void methodA();
         * }
         *
         * abstract class B extends A {
         *     // methodA is not implemented yet, so B remains abstract
         * }
         *
         * class C extends B {
         *     void methodA() {
         *         System.out.println("Implemented in C");
         *     }
         * }
         */

        /**
         * Summary:
         * --------
         * - Abstraction allows focusing on what an object does rather than how it does it.
         * - Use abstract classes when you want to share code among several closely related classes.
         * - Use interfaces when you want to define a contract for unrelated classes to implement.
         */
    }


