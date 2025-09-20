package Exception_Handling.Throw;

public class Demo2 {
    public static void main(String[] args) {
        int balance = 5000;
        int amount = 20000;

        try{
            if(amount > balance){
                throw new ArithmeticException("Insufficient funds: Withdrawal amount exceeds balance.");
            }
        }catch (ArithmeticException e){
            System.out.println("Exception " + e.getMessage());
        }

    }
}
//throw new ArithmeticException("message"): This creates a new ArithmeticException object with the specified message.
//Improved Debugging: