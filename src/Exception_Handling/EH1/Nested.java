package Exception_Handling.EH1;

//NESTED TRY

public class Nested {
    public static void main(String[] args) {

        try {
            // System.out.println(10 / 0);
            try {                                         //more risky
                int a[] = {2, 'A', 4};
                System.out.println(a[4]);
            } catch (ArrayIndexOutOfBoundsException r) {
                System.out.println("EXCEPTION OCCUR ");
            }
            System.out.println(10 / 2);            //REMEMBER whenever you will use nested (Less risky)
        }
        catch (ArithmeticException f ) {
            System.out.println("Arithmetic occur");
        }
    }
}



