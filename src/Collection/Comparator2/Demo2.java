package Collection.Comparator2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo2 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      return o2.length()-o1.length();
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ama");
        list.add("Sail");
        list.add("Manoj");

        list.sort(new Demo2());
        System.out.println(list);
    }
}


/*
This program demonstrates how to create a custom Comparator by implementing the Comparator interface
to control sorting logic.
Sorts the strings based on their length in descending order (long → short).
*/


