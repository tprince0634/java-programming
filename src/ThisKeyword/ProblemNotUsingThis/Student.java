package ThisKeyword.ProblemNotUsingThis;

class Student {
    int id;   // instance variable

    Student(int id) {   // local variable
        id = id;       //  local = local
    }

    void display() {
        System.out.println("Student ID: " + id);
    }

    public static void main(String[] args) {
        Student s = new Student(101);
        s.display();
    }
}
