package Exception_Handling.Multiple_Catch;

public class Demo {
    public static void main(String[] args) {

        try {
            int[] num3 = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
            System.out.println(num3[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("OUT OF LIMIT ");
        } catch (ArithmeticException r) {
            System.out.println("Sorry for arithmetic exception");
        } catch (Exception r) {
            System.out.println("Exception occur" + r);
        }


    }
}
