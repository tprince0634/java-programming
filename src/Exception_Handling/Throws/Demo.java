package Exception_Handling.Throws;

public class Demo {
    int a = 5;

    public void divide() throws  ArithmeticException {
        int result = a / 0;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            demo.divide();
        } catch (ArithmeticException e) {
            e.printStackTrace(); // Correct usage
        }
    }
}
