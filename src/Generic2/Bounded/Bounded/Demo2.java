package Generic2.Bounded.Bounded;
//Lower Bounded Type Parameters -> that the type argument must be a supertype of a specific type.

import java.util.*;

public class Demo2 {

    //Lower bounds are less common in type parameter declarations but are frequently
    // used in method parameters with wildcards.
    //method


    public static void addNumbers(List <? super Number> list) {
         list.add(10);      // Integer
         list.add(10.5);    // Double
        // list.add("abc"); // ❌ Error: String is not a subclass of Number
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Object> objList = new ArrayList<>();
        addNumbers(objList);  // ✅ Object is a supertype of Number

        List<Number> numList = new ArrayList<>();
        addNumbers(numList);  // ✅ Number is allowed (super of itself)
    }
}

