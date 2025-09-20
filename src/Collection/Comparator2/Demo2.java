package Collection.Comparator2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo2 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
//      return o2.compareTo(o1) ;   //Ascending
        return o1.compareTo(o2) ;   //Descending
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aman");
        list.add("Sakil");
        list.add("Manoj");

//      list.sort(null);                                      // the natural order is lexicographical order (i.e., alphabetical order)
        list.sort(new Demo2());                            //If this will uncomment than Compare () will run
        System.out.println(list);
    }


}

