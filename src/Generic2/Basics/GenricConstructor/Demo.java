package Generic2.Basics.GenricConstructor;
//IT is not mandatory to make a class Generic for a Generic Constructor


public class Demo {
    <T> Demo(T amount){
        System.out.println("The Amount is : " + amount);
        System.out.println(amount.getClass().getName());
    }

    public static void main(String[] args) {
        Demo d = new Demo(500);
        Demo d2 = new Demo("Hello");

    }

}
