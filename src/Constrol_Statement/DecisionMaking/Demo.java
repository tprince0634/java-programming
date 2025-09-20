package Constrol_Statement.DecisionMaking;

public class Demo {
    public static void main(String[] args) {

//        if statement
//        Executes code if a condition is true.
        int x = 5;
        if (x > 0) {
            System.out.println("Positive number");
        }

//        if-else statement
//        Executes one block if true, another if false.
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non-positive");
        }

//       if-else else-if ladder
//       Multiple conditions.
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

//        Switch
        switch (5){
            case 1 :
                System.out.println("It is 1");
                break;
            case 2:
                System.out.println("It is 2");
                break;
            default:
                System.out.println("Dont know");
        }


    }
}
