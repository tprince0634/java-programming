package Collection.Comparable2;

import java.util.*;

class Student implements Comparable<Student> {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
       // return  this.age - s.age;      // Ascending by age
       // return Integer.compare(this.age,s.age);
        return s.name.compareTo(this.name);
    }

    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("John", 2),
                new Student("Alice", 20),
                new Student("Bob", 22)
        );


        Collections.sort(students);                 //       Uses compareTo()
        System.out.println(students);                       // [Alice (20), John (22), Bob (25)]
    }
}
