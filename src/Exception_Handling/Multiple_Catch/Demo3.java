package Exception_Handling.Multiple_Catch;

public class Demo3 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------");
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
}
