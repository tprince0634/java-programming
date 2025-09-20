package Knowledge;

import java.security.AlgorithmParameterGenerator;
import java.util.Scanner;

public class Basic2 {
    int Age;

    Basic2(int age){
        Age=age;
    }

    public void evaluateAge(){
        if(Age > 18){
            System.out.println("Adult");
        }else {
            System.out.println("Minor");
        }
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");

        while(!sc.hasNextInt()){
            System.out.println("Please Enter only  Integer");
            sc.next();
            System.out.println("Try again");
        }
        int inputage = sc.nextInt();

        Basic2 b2 = new Basic2(inputage);

     //   b2.Age = inputage; //This u can do
        b2.evaluateAge();






    }

}
