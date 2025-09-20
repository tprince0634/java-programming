package FFF.Finally;

public class Documentation {
    /**finally
     Purpose: The finally block is used in exception handling to execute a block of code after a try block,
     regardless of whether an exception was thrown or caught. It is typically used for cleanup activities,
     such as closing resources.
     */

    /**The finally block is always executed after the try block and any associated catch blocks,
     * even if an exception occurs.*/

    /**try {
     // Code that may throw an exception
     int result = 10 / 0; // This will throw an ArithmeticException
     } catch (ArithmeticException e) {
     System.out.println("Caught an exception: " + e.getMessage());
     } finally {
     System.out.println("This will always execute.");
     }*/
}
