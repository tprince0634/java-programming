package Wrapper;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        int num = 10; // Primitive type
        Integer obj = Integer.valueOf(num); // Primitive to Wrapper (Boxing)
        System.out.println(obj);

        int value = obj.intValue(); // Wrapper to Primitive (Unboxing)
        System.out.println(value);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // Autoboxing of int to Integer

        String str = "123";
        int number2 = Integer.parseInt(str); // Converts String to int

        Integer object = null; // Allowed
        // int number2 = null;     // Compilation Error

    }
}
