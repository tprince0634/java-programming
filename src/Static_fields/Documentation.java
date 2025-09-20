package Static_fields;

public class Documentation {

    /**
     * Static variables are also known as class variables.
     * They are declared using the `static` keyword within a class, but outside any method, constructor, or block.
     * Only one copy of a static variable exists per class, regardless of how many objects are created.
     * Static variables are created at the start of program execution and destroyed automatically when execution ends.
     * Initialization of a static variable is optional.
     */


    /**
     * A static variable is shared among all instances of a class.
     * It is initialized only once, at the start of program execution.
     */

    /**
     * When a Java program runs, the following steps occur:
     * 1. Start the JVM: The JVM starts by executing the `java` command followed by the name of the class containing the `main` method.
     * 2. Class Loading: The JVM uses the ClassLoader to load the specified class and any other classes it depends on.
     * 3. Linking: The JVM verifies, prepares, and resolves the loaded classes.
     * 4. Initialization: The JVM initializes static variables and executes static blocks in the order they appear in the class.
     * 5. Execution of the main Method: The JVM invokes the `main` method, which serves as the program’s entry point.
     * 6. Object Creation: If the program creates class instances, the JVM loads those classes as needed and initializes them.
     * 7. Garbage Collection: The JVM automatically reclaims memory used by objects that are no longer in use.
     */
}
