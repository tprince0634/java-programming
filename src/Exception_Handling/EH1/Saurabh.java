package Exception_Handling.EH1;

public class Saurabh {

    // Method that throws ArithmeticException

    public static void show() throws ArithmeticException {
        System.out.println(40 / 0);    // This will throw an exception
    }

    public static void main(String[] args) {
        // Handling ArithmeticException from show()
        try {
            show();
        } catch (ArithmeticException h) {
            System.out.println("Exception occur can't divide by zero: " + h.getMessage());
        }


        // Handling NullPointerException
        try {
            String b = null;
            System.out.println(b.length());  // This will throw NullPointerException
        } catch (NullPointerException d) {
            System.out.println("The b variable is null: " + d);
        } finally {
            System.out.println("FIRST PROGRAM IS FINISHED");
        }

        // This block is not necessary as it will not throw NullPointerException
        try {
            System.out.println(34 / 10); // This will not throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Sorry: " + e);
        } finally {
            System.out.println("Finally block: Java default mechanism");
        }

    }
}