package Opps.INHERITANCE;

/**
 * INHERITANCE IN JAVA
 *
 * Inheritance is a fundamental concept of Object-Oriented Programming (OOP)
 * that allows one class (child/subclass) to inherit the properties and behaviors
 * (variables and methods) of another class (parent/superclass).
 *
 * It promotes:
 * ✔ Code reusability
 * ✔ Method overriding
 * ✔ Runtime polymorphism
 *
 * In Java, inheritance is achieved using the "extends" keyword.
 *
 * Syntax:
 * class Child extends Parent {
 *     // inherited members
 * }
 *
 * ---------------------------------------------------------
 * TYPES OF INHERITANCE IN JAVA
 * ---------------------------------------------------------
 *
 * Java supports the following inheritance types:
 *
 * 1. Single Inheritance
 * 2. Multilevel Inheritance
 * 3. Hierarchical Inheritance
 * 4. Multiple Inheritance (through interfaces only)
 * 5. Hybrid Inheritance (combination using interfaces)
 *
 */


public class Documentation {


    /**
     * 1. SINGLE INHERITANCE
     *
     * Definition:
     * In single inheritance, one child class inherits from one parent class.
     *
     * Example:
     * Animal → Dog
     *
     * Structure:
     * Parent → Child
     */


    /**
     * 2. MULTILEVEL INHERITANCE
     *
     * Definition:
     * In multilevel inheritance, a class inherits from another class,
     * and that class inherits from another class.
     *
     * Example:
     * Animal → Dog → Puppy
     *
     * Structure:
     * Grandparent → Parent → Child
     */


    /**
     * 3. HIERARCHICAL INHERITANCE
     *
     * Definition:
     * In hierarchical inheritance, multiple child classes inherits
     * from a single parent class.
     *
     * Example:
     * Animal → Dog
     * Animal → Cat
     *
     * Structure:
     *        Parent
     *       /     \
     *   Child1   Child2
     */


    /**
     * 4. MULTIPLE INHERITANCE
     *
     * Definition:
     * Multiple inheritance means a class inherits from more than one parent class.
     *
     * Java does NOT support multiple inheritance with classes
     * to avoid ambiguity (Diamond Problem).
     *     A
     *    / \
     *   B C
     *    \ /
     *     D
     *
     * In this diamond-shaped inheritance hierarchy, both classes B and C inherit from class A,
     * and class D inherits from both B and C. If class A has a method foo(), and classes B and C
     * override  foo() with different implementations, the compiler may not be able to determine
     * which version of foo() to use in class D.However, Java supports multiple inheritance using interfaces.
     *
     * Example:
     * interface A {}
     * interface B {}
     * class C implements A, B {}
     */


    /**
     * 5. HYBRID INHERITANCE
     *
     * Definition:
     * Hybrid inheritance is a combination of two or more types of inheritance,
     * such as single, multilevel, and multiple inheritance.
     *
     * Java supports hybrid inheritance only through interfaces.
     *
     * Example:
     * Animal → Dog → Puppy
     * Dog implements Pet interface
     */


    /**
     * Key Benefits of Inheritance:
     *
     * ✔ Code reusability
     * ✔ Method overriding
     * ✔ Polymorphism support
     * ✔ Reduces code duplication
     * ✔ Improves maintainability
     */


    /**
     * Interview One-Line Definition:
     *
     * Inheritance is a mechanism in Java that allows one class to inherit
     * the properties and behaviors of another class using the extends keyword.
     */
}
