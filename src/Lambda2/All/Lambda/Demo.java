package Lambda2.All.Lambda;

import Lambda2.All.Student;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();


        Student student = (name -> {
            System.out.println("This is a student : " + name);
        });
        student.getbio("Om");

    }
}
