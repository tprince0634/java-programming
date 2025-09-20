package FFF.Final;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        final int number = 10;
//       number = 20;     ❌ Not allowed - value cannot be changed.

        final List<String> names = new ArrayList<>();
        names.add("John");   // ✅ allowed
        names.add("Emma");   // ✅ allowed
        System.out.println(names);

//      names = new ArrayList<>(); ❌ Not allowed - reference cannot be changed.
//      This is called reassignment because you are assigning a new object to the same variable (names).
        names.set(0, "David");  // ✅ allowed - you can modify elements
        System.out.println(names);



    }
}
