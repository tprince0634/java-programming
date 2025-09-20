package Constrol_Statement.Looping_Statement;

public class Demo {
    public static void main(String[] args) {
        //for loop
        //The for loop is used when you know in advance how many times you want to execute a block of code.
        //It consists of three parts: initialization, condition, and increment/decrement.
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

       // while loop:
        // The while loop is used when you want to execute a block of code repeatedly as long as a condition is true.
        // It only consists of a condition, and the loop continues to execute as long as the condition evaluates to true.
        int i = 0;
        while (i < 5) {
            System.out.println("Iteration " + i);
            i++;
        }


        //do-while loop:
        //The do-while loop is similar to the while loop, but it guarantees that the block of code is executed at least once before checking the condition.
        //It consists of a block of code followed by a while condition.

        int j = 0;
        do {
            System.out.println("Iteration " + j);
            j++;
        } while (j < 5);


       // enhanced for loop (for-each loop):
       // The enhanced for loop (also known as the for-each loop) is used to iterate over elements of arrays or collections.
       // It simplifies iterating through arrays or collections by hiding the details of the iterator.

        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }





    }
}
