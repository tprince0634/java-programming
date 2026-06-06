package Opps.Encapsulation;

import java.util.InputMismatchException; // Import the InputMismatchException class
import java.util.Scanner;

public class New {
    private int Age;

    Scanner sc = new Scanner(System.in);

    public void setAge() {
        int age = -1;           // Initialize age to an invalid value

        while (age < 0) {         // Continue prompting until a valid age is entered

            System.out.print("ENTER YOUR AGE: ");
            try {
                age = sc.nextInt(); // Try to read an integer
                if (age >= 0) {
                    Age = age; // Set the age if valid
                } else {
                    System.out.println("INVALID AGE. Please enter a valid age.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ENTER INTEGER ONLY");
                sc.next(); // Clear the invalid input
            }
        }
    }

    public int getAge() {
        return Age;
    }

    public static void main(String[] args) {
        New obj = new New();
        obj.setAge(); // This will keep prompting until a valid age is entered
        System.out.println("YOUR AGE IS: " + obj.getAge());
    }
}