package Collection.Comparator2;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("PineApple");
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

       list.sort((a,b) -> a.compareTo(b)); // Because String already implements Comparable
       System.out.println("After Sorting: " + list);
    }
}
/*
This program demonstrates how to use a Comparator with lambda expression to sort a list of strings
in alphabetical (natural) order.
compareTo() Method compares two strings using compareTo() and arranges them from A &rarr; Z.*/
