package Wrapper;

public class Hdfc {
    public static void main(String[] args) {

        /* parse methods:
         * In Java, the parse methods are commonly used to convert strings into various primitive types.
         */

        // Converts a string to an int.
        String h = "123";
        int number = Integer.parseInt(h);
        System.out.println(number); // 123

        // Converts a string to a double.
        String doubleString = "45.67";
        double value = Double.parseDouble(doubleString);
        System.out.println(value); // Output: 45.67

        String floatString = "12.34";
        float fValue = Float.parseFloat(floatString);
        System.out.println(fValue); // Output: 12.34

        String booleanString = "true";
        boolean boolValue = Boolean.parseBoolean(booleanString);
        System.out.println(boolValue); // Output: true

        // String comparisons
        String s1 = "millionaire";
        String s2 = "millionaire";

        String s3 = new String("millionaire");
        String s4 = new String("MONEY");

        System.out.println("RESULT1: " + (s1 == s2)); // true, both references refer to the same object
        System.out.println("RESULT2: " + s1.equals(s2)); // true, comparing actual object values
        System.out.println("RESULT3: " + (s1 == s3)); // false, s1 and s3 reference different objects
        System.out.println("RESULT4: " + s1.equals(s3)); // true, s1 and s3 have the same value
        System.out.println("RESULT5: " + s1.equals(s4)); // false, different objects and different values
    }
}

