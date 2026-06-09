package ToStringExample;

public class Employee {
    private  int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Prince" , 5000);
        System.out.println(emp);
    }
}
