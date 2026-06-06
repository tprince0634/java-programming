package Exception_Handling.Throw;

public class ThrowWithUnchecked {
    public static void main(String[] args) {

        int balance = 5000;
        int amount = 20000;

            if(amount > balance) {
                //Unchecked Exception Throwing
                throw new ArithmeticException("Insufficient funds: Withdrawal amount exceeds balance.");
            }

    }
}

//throw new ArithmeticException("message"): This creates a new ArithmeticException object with the specified message.
//Improved Debugging: