package Constrol_Statement.Breaking_Statement;

public class Demo {


    //return statement
    public void someMethod() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return; // Exit method and loop when i equals 5
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        // Using the break statement:
        //The break statement is used to terminate the loop immediately and transfer control to the statement following the loop.
        //It can be used with for, while, do-while, and switch statements.
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit loop when i equals 5
            }
            System.out.println(i);
        }

        //Using the continue statement:
        //The continue statement is used to skip the rest of the current iteration and continue with the next iteration of the loop.
        //It can be used with for, while, and do-while loops.

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i);
        }

        //Using the return statement:
        //If the loop is contained within a method, you can use the return statement to exit the method and the loop simultaneously.
        //This terminates the loop and returns control to the caller of the method.
        //refer top




    }
}
