package Collection.Comparator2;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // toString for printing
    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Aman", 50000));
        list.add(new Employee(2, "Rahul", 70000));
        list.add(new Employee(3, "Zoya", 50000));
        list.add(new Employee(4, "Neha", 60000));

        // 🔹 1. Sort by Salary (Ascending)
        list.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("Sort by Salary (Asc): " + list);

        // 🔹 2. Sort by Salary (Descending)
        list.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        System.out.println("Sort by Salary (Desc): " + list);

        // 🔹 3. Sort by Name (Alphabetical)
        list.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("Sort by Name: " + list);

        // 🔹 4. Multiple Sorting (Salary → then Name)
        list.sort((e1, e2) -> {
            int result = Double.compare(e1.salary, e2.salary);
            if (result == 0) {
                return e1.name.compareTo(e2.name);
            }
            return result;
        });
        System.out.println("Sort by Salary then Name: " + list);

        // 🔹 5. Modern Way (Best Practice)
        list.sort(
                Comparator.comparing((Employee e) -> e.salary)
                        .thenComparing(e -> e.name)
        );
        System.out.println("Modern Comparator: " + list);
    }

}
