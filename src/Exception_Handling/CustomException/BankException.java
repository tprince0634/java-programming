package Exception_Handling.CustomException;

public class BankException extends RuntimeException {

    // Constructor
    BankException(String message) {
        super(message);
    }

    // Method to withdraw money
    public static void withdraw(int balance, int amount) {

        if (amount > balance) {
            throw new BankException("Insufficient balance: " + balance);
        }
        else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
        else {
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
        }
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 7000);   // will throw exception
        }
        catch (BankException e) {
            System.out.println(e.getMessage());
        }

    }
}

/*We create a custom exception by extending RuntimeException.
This makes it an unchecked exception.
If the withdrawal amount is greater than balance, we throw the exception.
It is handled using try-catch in main().
*/