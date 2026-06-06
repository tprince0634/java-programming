package FFF.Static;

public class Demo2 {

    static String college = "ABC College";     // class variable
    String name;                              // instance variable (Each object has its own copy)

        public static void main(String[] args) {
            Demo2 demo2 = new Demo2();
            Demo2 demo3 = new Demo2();

            demo2.name = "Rahul";
            demo3.name = "Aman";

            //shared among all the objects
            System.out.println(demo2.college); // ABC College
            System.out.println(demo3.college); // ABC College

            //Each object has its own copy
            System.out.println(demo2.name);
            System.out.println(demo3.name);

        }
    }


