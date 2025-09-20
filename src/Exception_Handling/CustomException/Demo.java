package Exception_Handling.CustomException;

public class Demo extends RuntimeException{

    int  age;
    Demo(String message){
        super(message);
    }

    public static void checkAge(int age){
        if(age<0){
            throw  new Demo("Age can not be negative");
        }else {
            System.out.println("Ok");
        }
    }

    public static void main(String[] args) {

        checkAge(-5);
    }
}
