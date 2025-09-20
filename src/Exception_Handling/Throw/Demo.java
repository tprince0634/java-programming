package Exception_Handling.Throw;

public class Demo {
    public static void main(String[] args) {
        int age = 0;
        if(age < 0){
            throw new  ArithmeticException("Age cannot be negative");
        }
    }
}
