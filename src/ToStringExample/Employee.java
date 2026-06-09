package ToStringExample;

public class Employee {

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1,"Prince", 5959);
        System.out.println(emp);
    }
}
/*The main purpose of overriding the toString() method is to provide a meaningful and readable
representation of an object. By default, the toString() method from the Object class returns
the class name and hash code (memory reference), which is not very useful to users or developers.
When we override it, we can display the actual data stored in the object, making debugging, logging,
and printing object details much easier.*/