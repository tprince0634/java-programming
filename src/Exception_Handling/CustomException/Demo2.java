package Exception_Handling.CustomException;

public class Demo2 extends Exception {
    // Constructor for the custom exception
    Demo2(String message) {
        super(message);
    }

    // Method to check the value size
    public static void valueSize(int value) throws Demo2 {
        if (value < 5) {
            throw new Demo2("Value is too small: " + value);
        } else if (value >= 5 && value < 10) {
            System.out.println("Value is good: " + value);
        } else {
            System.out.println("Value is too large: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            valueSize(-4); // This will throw an exception
        } catch (Demo2 e) {
//            System.out.println("Caught exception: " + e.getMessage());
            System.out.println(e);
        }


    }
}