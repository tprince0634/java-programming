package Generic2.Basics.ProblemBeforeGeneric;

import java.util.ArrayList;

//A Class without Generic

public class Demo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(500);
        list.add(100);
        list.add("Fruits");

        String o1 = (String) list.get(0);   // Typecasting
        System.out.println(o1);

        String o2 = (String) list.get(1);   //SET Integer hai GET String still No Compile Time Error
        System.out.println(o2);

/**
 * No Type Safe
 * Manual Casting
 * No Compile Time Error
 * */

    }
}
