package Collection.Comparator2;

import java.util.*;

public class Demo implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
//     return o2.compareTo(o1);                        // (Alphabetically)
       return o2.length() - o1.length();               // According to Length
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("PineApple");
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

//      list.sort(null);                      //This tells Java to use natural order(Alphabetically)
        list.sort(new Demo());

        System.out.println("After Sorting :"  + list);


    }
}
