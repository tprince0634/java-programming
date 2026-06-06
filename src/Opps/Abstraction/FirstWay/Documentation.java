package Opps.Abstraction.FirstWay;

/**
 * ABSTRACTION IN JAVA
 * ===================
 *
 * Definition:
 * -----------
 * Abstraction is an OOP concept that hides implementation details
 * and shows only the essential features to the user.
 *
 * In simple words:
 * Abstraction focuses on WHAT an object does, not HOW it does it.
 *
 * When you drive a car, you use steering, brake, and accelerator.
 * You don't know the internal engine working. That is abstraction.
 *
 *
 * Ways to achieve abstraction in Java:
 * ------------------------------------
 * 1. Using abstract classes
 * 2. Using interfaces
 *
 *
 * ============================================================
 * ABSTRACT CLASS
 * ============================================================
 *
 * Definition:
 * -----------
 An abstract class is a class that cannot be instantiated and may contain both abstract methods
 (without body) and concrete methods (with body).
 Abstract methods must be implemented by the child class.
 *

 * Object creation:
 * ----------------
 * Animal a = new Dog();  // Allowed
 * Animal a = new Animal(); // NOT allowed (abstract class)
 *
 * ============================================================
 * WHY ABSTRACT CLASS CANNOT CREATE OBJECT?
 * ============================================================
 *
 * Because abstract class may have abstract methods without implementation.
 * So object would result in incomplete behavior.
 *
 *
 * ============================================================
 * ABSTRACT CLASS CAN HAVE:
 * ============================================================
 *
 * ✔ Abstract methods - Only methods can be abstract
 * ✔ Concrete methods
 * ✔ Variables
 * ✔ Constructors
 *  Java does NOT support abstract variables.
 *
 * ============================================================
 * IMPORTANT RULES
 * ============================================================
 *
 * Rule 1:
 * If class has abstract method, class must be abstract.
 *
 * Rule 2:
 * Child class must implement all abstract methods,
 * otherwise child class must also be abstract.
 *
 * It helps in:
 * ✔ Security
 * ✔ Code reusability
 * ✔ Flexibility
 *
 */
public class Documentation {
}
