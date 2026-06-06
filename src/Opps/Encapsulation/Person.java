package Opps.Encapsulation;
import java.util.Scanner;


public class Person {
    private int salary;
    private String name;

    Scanner sc = new Scanner(System.in);

    public void setSalary() {

        do {
            System.out.println("Enter Your Salary");
            if (sc.hasNextInt()) {
                int salary = sc.nextInt();
                if (salary > 0) {
                    this.salary = salary;
                    break;
                } else {
                    System.out.println("Plese enter valid Salary");
                }
            } else {
                System.out.println("\"Invalid input. Enter integers only.\"");
                sc.next();
            }
        } while (true) ;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("My name is Prince");
        System.out.println(person.getName());

        person.setSalary();
        System.out.println("My Salary is " + "" + person.getSalary());


    }
}
