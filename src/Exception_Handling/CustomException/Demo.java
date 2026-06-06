package Exception_Handling.CustomException;

public class Demo extends Exception{

    int  age;

    Demo(String message){
        super(message);
    }

    public static void checkAge(int age) throws Demo {
        if(age<0){
            throw  new Demo("Age can not be negative");
        }else {
            System.out.println("Ok");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(-5);
        }
        catch(Demo e){
            System.out.println(e.getMessage());
        }
    }
}


/*We create a custom exception by extending the Exception class.
This makes it a checked exception.
Because it is checked, we must declare it using throws.
If the age is negative, we throw the custom exception.
The exception is handled using try-catch in main().*/