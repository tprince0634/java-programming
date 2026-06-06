package Exception_Handling;

public class Documentation {

/** WHAT IS ERROR (unchecked)
 * A error refers to a serious problem that occurs during
 * the execution of a program that indicates serious issues related to the JVM or system resources,
 * and applications are not expected to catch or handle them.
 * */

    /**
     * WHAT IS EXCEPTION
     * An exception is an unwanted or unexpected event that occurs during the execution of a program,
     * disrupting its normal flow
     * It can be caught and handled using exception handling mechanisms like try, catch, finally, throw, and throws.
     * */


    /**
     * WHAT IS EXCEPTION HANDLING
     * ITS  is a process of Handling the exception that occurs in a runtime, in this we should have an alternate
     * source through which we can handle the exception.
     * */
    /**

     * Exception Hierarchy
     *
     *           Throwable   -->>The root class for all exceptions and errors
     *           ├── Error         (Unchecked)
     *           │   ├── OutOfMemoryError      -->> Indicates that the JVM has run out of memory.
     *           │   ├── StackOverflowError    -->> Indicates that the stack has overflowed, usually due to excessive recursion.
     *           │   └── NoClassDefFoundError  -->> Indicates that a class definition was not found at runtime.
     *           └── Exception
     *               ├── Checked Exceptions     -->> Checked exceptions are exception that are checked at compile-time. The Java compiler requires that these exceptions be either caught in a try-catch block or declared in the method signature using the throws keyword. This ensures that the programmer is aware of these exceptions and has a plan to handle them.
     *               │   ├── IOException
     *               │   ├── SQLException
     *               │   └── ClassNotFoundException
     *               ├── Unchecked Exceptions   -->> (RARELY OCCUR ) Unchecked exceptions are exceptions that are not checked at compile-time.
     *                 These exceptions extend the RuntimeException class, and the compiler does not require them to be caught or declared.

     *               │   ├── RuntimeException
     *               │   │   ├── NullPointerException               -->> Attempting to use an object reference that is null.
     *               │   │   ├── ArrayIndexOutOfBoundsException     -->> Accessing an array with an illegal index.
     *               │   │   └── IllegalArgumentException           -->>  Invalid arguments passed to a method.
     *               │   └── ArithmeticException                    -->> Issues related to arithmetic operations (e.g., division by zero).
     *               └── Custom Exceptions                          -->> User-defined exceptions tailored to specific application needs.
     *
     * Base Class: Exception  -->> This class may have several subclasses that represent more specific types of exceptions.
     * Subclasses: ArithmeticExceptions, FileNotFoundException or IOException .
     *
     * */

    /**
     *  Checked Exceptions -->> Checked exceptions are exception that are checked at compile-time.
     *  The Java compiler requires that these exceptions be either caught in a try-catch block or declared
     *  in the method signature using the throws keyword.
     *  This ensures that the programmer is aware of these exceptions and has a plan to handle them.
     *  */
    /**
     * Unchecked Exceptions  -->> (RARELY OCCUR ) Unchecked exceptions are exceptions that are not checked at compile-time.
     * These exceptions extend the RuntimeException class, and the compiler does not require them to be caught or declared.
     *
     * */



    /**
     * try block
     * The try block is used to enclose code that might throw an exception.
     * If an exception occurs within the try block, the control is transferred to the corresponding catch block.
     *
     *EXAMPLE::
     * try {
     *     int result = 10 / 0; // This will throw an ArithmeticException
     * } catch (ArithmeticException e) {
     *     System.out.println("An error occurred: " + e.getMessage());
     * } */

    /**
     * catch block
     * The catch block is used to handle exceptions that are thrown by the code in the try block.
     * You can have multiple catch blocks to handle different types of exceptions.
     * Each catch block can specify a different type of exception.
     *
     * EXAMPLE::
     * try {
     *     int[] numbers = {1, 2, 3};
     *     System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
     * } catch (ArrayIndexOutOfBoundsException e) {
     *     System.out.println("Array index is out of bounds: " + e.getMessage());
     * } catch (Exception e) {
     *     System.out.println("An error occurred: " + e.getMessage());
     * }
     * */

    /**
     * Finally block
     * The finally block is optional and is used to execute code that must run regardless of
     * whether an exception was thrown or caught. This block is typically used for cleanup activities,
     * such as closing files or releasing resources.
     * EXAMPLE::
     *
     try {
     System.out.println("Inside try block");
     int result = 10 / 0; // This will throw ArithmeticException
     System.out.println("Result: " + result);
     } catch (ArithmeticException e) {
     System.out.println("Caught ArithmeticException: " + e.getMessage());
     } finally {
     System.out.println("This is the finally block, executed regardless of an exception.");
     }
     System.out.println("End of main method.");
     }
     * */

    /**
     * Different between FINAL, FINALLY, FINALIZE
     *
     * FINAL KEYWORD
     * The final keyword is a modifier that can be applied to variables, methods, and classes,
     * and it serves different purposes depending on where it is used.
     *
     * FINALLY
     * It is a block of code that is associated with a try block and is executed after the try block,
     * regardless (ध्यान दिए बगैर) of whether an exception was thrown or caught.
     * The finally  block is typically used for cleanup activities, such as closing resources
     * (like files or database connections) or releasing locks. (IN TRY BLOCK ONLY)
     * */
    /**
     * Finalize
     * The term finalize refers to a method called finalize(), which is part of the Object class
     * This method is used for cleanup operations before an object is garbage collected.
     * When the garbage collector determines that there are no more references to an object,
     * it calls the finalize() method.
     * */






    /**USER DEFINE EXCEPTION */
/**
 * THROW   --->>>Throw keyword is used to throw an Exception
 *  The throw keyword is used to explicitly throw an exception.
 *  We can throw either checked or uncheked exception in java by throw keyword.
 *
 *  SYNTAX
 *  throw new ExceptionType("Error message");
 * */

/**
 * throw: Used to explicitly throw an exception.
 * throws: Used in a method signature to declare that the method can throw exceptions,
 * allowing the caller to handle them.
 * */

/**In Java, the throws keyword is used in method declarations to indicate that a method can
 * throw one or more exceptions and Method  does not handle that.
 * IT allowing the caller of the method to be aware
 * of the potential for that exception and to handle it appropriately.
 *  */



/**
 * A custom exception in Java is a user-defined exception that extends the Exception class
 * (or one of its subclasses).
 * Custom exceptions allow developers to create specific exception
 * types that can be thrown and caught in their applications, providing more meaningful
 * error handling tailored to the application's requirements.
 * */

/**You can use try and catch blocks to handle both checked and unchecked exceptions.*/
}





