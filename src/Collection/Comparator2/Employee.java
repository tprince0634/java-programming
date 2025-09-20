package Collection.Comparator2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
   private String name;
   private Integer Salary;

   Employee(String name,Integer Salary){
       this.name=name;
       this.Salary=Salary;
   }


    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Morkel",6000));
        list.add(new Employee("Akmal",4000));
        list.add(new Employee("Kamal",8000));
        list.add(new Employee("Priya",9000));


//        list.sort((a,b) -> a.getName().compareTo(b.getName()));
//        list.sort((a,b) -> a.getSalary().compareTo(b.getSalary()));   //priority

        list.sort(Comparator.comparing(Employee::getName).reversed());


        System.out.println(list);
    }
}
