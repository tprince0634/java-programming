package Lambda2.All.Old;

import Lambda2.All.Student;

public class EngineeringStudent implements Student {
    @Override
    public void getbio(String name) {
        System.out.println("The Student name is : " + name );
    }

    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.getbio("Om Nagware");
    }
}
