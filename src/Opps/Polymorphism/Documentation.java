package Opps.Polymorphism;

/**
 * Polymorphism in Java
 *
 * Polymorphism is one of the core principles of object-oriented programming.
 * It allows a single method or function to behave differently based on the object that invokes it.
 *
 * Types of Polymorphism:
 *
 *
 *
 * Compile-Time Polymorphism (Static Binding):
 * Compile-time polymorphism occurs when the decision about which method to call is made at compile time based on the method signature.
 * It is achieved through method overloading, where multiple methods with the same name but different parameter lists (number or type of parameters) are defined within the same class.
 * The compiler determines the appropriate method to invoke based on the number and types of arguments provided in the method call.
 * Compile-time polymorphism is also known as static binding because the method call is resolved at compile time and cannot be changed at runtime.
 *
 Runtime polymorphism occurs when the decision about which method to call is made at runtime based on the actual type of the object.
 It is achieved through method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass.
 The JVM determines the appropriate method to invoke based on the actual object type (not the reference type) at runtime.
 Runtime polymorphism allows for flexibility and extensibility in object-oriented designs, as it enables subclass objects to exhibit behavior specific to their type.
 *
 * Benefits:
 * - Increases flexibility and reusability of code.
 * - Makes it easier to manage and scale applications by treating different types as one (e.g., using superclass references).
 */
public class Documentation {
    // This class is used for conceptual documentation only.
}
