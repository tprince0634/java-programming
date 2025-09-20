package Knowledge;

import java.util.Scanner;

public class Basic {

int Age;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");

        while(!sc.hasNextInt()){
            System.out.println("Enetr only integer");
            sc.next();
            System.out.println("Try Again");
        }

        int  age = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");
        }else {
            System.out.println("Minor");
        }


    }
}
