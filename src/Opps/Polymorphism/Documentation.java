package Opps.Polymorphism;

/**
 * Polymorphism in Java
 *
 Polymorphism is an OOP concept that allows an object or method to take multiple forms.
 In Java, polymorphism is achieved through method overloading (compile-time polymorphism)
 and method overriding (runtime polymorphism), where the same method behaves differently
 depending on the object.
 *
 * Types of Polymorphism:
 *
 * Method overloading is a feature in Java where multiple methods have the same name but different parameter lists
 * (different number, type, or order of parameters) in the same class.
 * It is used to achieve compile-time polymorphism.
 *
 * Method overriding is a feature in Java where a child class provides its own implementation of a method that is already
 * defined in the parent class, using the same method signature.
 * It is used to achieve runtime polymorphism.
 *
 *
 * Compile-Time Polymorphism (Static Binding):
 * Compile-time polymorphism occurs when the decision about which method to call is made at compile time based on the method signature.
 * It is achieved through method overloading, where multiple methods with the same name but different parameter lists (number or type of parameters)
 * are defined within the same class.
 * The compiler determines the appropriate method to invoke based on the number and types of arguments provided in the method call.
 * Compile-time polymorphism is also known as static binding because the method call is resolved at compile time and cannot be changed at runtime.
 *
 *
 *
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
