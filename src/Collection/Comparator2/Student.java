package Collection.Comparator2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private double gpa;

    // Constructor
    public Student(double gpa, String name) {
        this.gpa = gpa;
        this.name = name;
    }

    public Student() {

    }

    // Getters
    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + "}";
    }



    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(8, "Alice"));
        students.add(new Student(6, "Bob"));
        students.add(new Student(3, "Mak"));
        students.add(new Student(1, "Charlie"));

//        students.sort(null); error because your class  do not implement comparator

        students.sort((a,b) ->{
            return  a.getName().compareTo(b.getName());
        });

        students.sort((a,b) ->{
            int result = Double.compare(a.getGpa(), b.getGpa());
            return result;
        });


//        students.sort(Comparator.comparing(student -> student.getName()));
//        students.sort(Comparator.comparing((Student student) -> student.getName()).reversed());

        students.sort(Comparator.comparing(Student::getGpa).thenComparing(Student::getName));





//        without implementation

/*       students.sort(((o1, o2) -> {
           int a = Double.compare(o1.getGpa(), o2.getGpa()); // GPA ascending
           if (a != 0) {
                return a;
           }
            return o1.getName().compareTo(o2.getName()); // Name ascending
        }));
 */

        System.out.println(students);
    }
}
