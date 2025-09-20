public class ControlStatementsExample {

    public static void main(String[] args) {

        // 1. Decision-Making Statements (if, if-else, else-if, switch)

        int num = 10;

        // if statement
        if (num > 5) {
            System.out.println("The number is greater than 5.");
        }

        // if-else statement
        if (num < 5) {
            System.out.println("The number is less than 5.");
        } else {
            System.out.println("The number is greater than or equal to 5.");
        }

        // else-if statement
        if (num < 5) {
            System.out.println("The number is less than 5.");
        } else if (num == 10) {
            System.out.println("The number is exactly 10.");
        } else {
            System.out.println("The number is greater than 10.");
        }

        // switch statement
        switch (num=9) {
            case 5:
                System.out.println("The number is 5.");
                break;
            case 10:
                System.out.println("The number is 10.");
                break;
            default:
                System.out.println("The number is neither 5 nor 10.");
        }



        // 2. Looping Statements (for, while, do-while)

        // for loop
        System.out.println("\nFor Loop Example:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration " + (i + 1));
        }

        // while loop
        System.out.println("\nWhile Loop Example:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count is " + count);
            count++;
        }

        // do-while loop
        System.out.println("\nDo-While Loop Example:");
        int counter = 7;
        do {
            System.out.println("Counter is " + counter);
            counter++;
        } while (counter < 3);

        // 3. Jump Statements (break, continue, return)

        // break statement in loop
        System.out.println("\nBreak Statement Example:");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exits the loop when i == 3
            }
            System.out.println("i = " + i);
        }

        // continue statement in loop
        System.out.println("\nContinue Statement Example:");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Skipping the iteration when i = " + i);
                continue; // Skips the current iteration when i == 3
            }
            System.out.println("i = " + i);
        }

        // return statement (in a method)
        System.out.println("\nReturn Statement Example:");
        int result = sum(5, 3); // Calls the sum method
        System.out.println("The sum of 5 and 3 is: " + result);
    }

    // Method to demonstrate return statement
    public static int sum(int a, int b) {
        return a + b; // Returns the sum of a and b
    }
}
