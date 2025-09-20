package Opps.Encapsulation;


import java.util.Scanner;
import java.util. InputMismatchException;

public class Person {

    Scanner sc = new Scanner(System.in);
    private String name;
    private int salary ;


    public void setSalary() {
        System.out.println("ENTER YOUR SALARY: ");

        int salary = -1;                      // Initialize age to an invalid value
        while (salary < 0) {                  // Continue prompting until a valid age is entered
            try {
                salary = sc.nextInt();           // Try to read an integer
                if (salary >= 0) {
                   this.salary = salary; // Set the age if valid
                } else {
                    System.out.println("INVALID salary. Please enter a valid salary.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ENTER INTEGER ONLY");
                sc.next();                // Clear the invalid input
            }
        }
    }


    public int getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Person obj = new Person();

        obj.setName("THE NAME IS : RAGNOR LOTHBROK");
        obj.setSalary();
        System.out.println("THE SALARY IS :: " + obj.getSalary());
        System.out.println(obj.getName());

    }
}
