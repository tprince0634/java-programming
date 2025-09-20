package Exception_Handling.Multiple_Catch;

public class Demo4 {
    public static void main(String[] args) {
        try {
            String A = "ff";                   // This string cannot be parsed into an integer
            int f = Integer.parseInt(A);       // This will throw NumberFormatException
            System.out.println(f);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (Exception f){
            System.out.println("ok ok No problem" + f);
        } finally{
            System.out.println("This is the finally block, executed regardless of an exception.");
        }
    }
}
