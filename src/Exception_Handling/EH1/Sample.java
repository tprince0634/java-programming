package Exception_Handling.EH1;

public class Sample {
    public static void main(String[] args) {


        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        try {
            System.out.println(num[7]);     //indexing start from zero
        } catch (Exception e) {
            System.out.println(e);  //This is to know the types of exception
            System.out.println("Exception occur   num1"); //not get executed Because exception occur and  not handled
        }


        try {
            int a, b, c;
            a = 10;
            b = 0;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cant divisible by zero" );
        }



        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);                // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        }


    }
}

