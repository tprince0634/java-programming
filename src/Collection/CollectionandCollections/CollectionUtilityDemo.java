package Collection.CollectionandCollections;

import javax.swing.plaf.basic.BasicSliderUI;
import java.util.*;
import java.util.concurrent.Callable;

public class CollectionUtilityDemo {
    public static void main(String[] args) {

        //Example of list
        List<String> cricketers = Arrays.asList(
                "Sanju Samson","Suryakumar yadav","Abhishek sharama",
                "Tilak Verma","Rinku Singh","Ramandip singh","Axar payel",
                "Arshdeep singh" , "Ravi bishnoi" , "Varun chakaravarthy",
                "Avesh khan","Jitesh sharma","Yash dayal","Sanju Samson");


        //Sorting alphabetically
       /* System.out.println("----------Aphabetical---------------");
        Collections.sort(cricketers);
        cricketers.forEach(System.out::println);*/

        //custom sorting by length
       /* System.out.println("----------Length---------------");
        Collections.sort( cricketers,Comparator.comparing(String::length));    //modern way
        Collections.sort(cricketers, (s1, s2) -> Integer.compare(s1.length(), s2.length()));   //lambda
        System.out.println(cricketers);*/

        //Sorting in descending order
     /*   System.out.println(cricketers);
        System.out.println("----------Descending---------------");
        Collections.sort(cricketers,(a,b) -> b.compareTo(a));    //lambda
        Collections.sort(cricketers,Collections.reverseOrder());   // modern way*/

        //Binary search (list should be in ascending order)  before this
        /*Collections.sort(cricketers);
        System.out.println(cricketers);
        int index = Collections.binarySearch(cricketers,"Yash dayal");
        System.out.println(index);*/

        //Reversing The original list
      /*  Collections.reverse(cricketers);
        System.out.println(cricketers);*/

        //shuffling
        /*Collections.shuffle(cricketers);
        System.out.println(cricketers);*/

        //swapping elemnet
       /* Collections.sort(cricketers);
        Collections.swap(cricketers,0,3);
        System.out.println(cricketers);*/

        //Create a unmodifiable collection

       // as we are using arrays.aslist we can not modify  but we can modify
         /* cricketers.add("Dhoni");    //error
          cricketers.set(0,"Dhoni bhai");
          System.out.println(cricketers);

          Collections.unmodifiableList(cricketers);   // here we make the list uNmodifiable
          cricketers.set(0,"Virat");
          System.out.println(cricketers);*/

        //Finding max and min by custom comparator
        /*String  a = Collections.max(cricketers,Comparator.comparing(String::length));    //modern way
        System.out.println(a);
        String aa = Collections.max(cricketers, (s1, s2) -> Integer.compare(s1.length(), s2.length()));   //lambda
        System.out.println(aa);


        String  b = Collections.min(cricketers,Comparator.comparing(String::length));
        System.out.println(b);
        String bb = Collections.min(cricketers,(g,f) -> Integer.compare(g.length(),f.length()));
        System.out.println(bb);*/

        //Frequency of an element  (THe number of times object get repeated in the list)
       /* int f = Collections.frequency(cricketers,"Sanju Samson");
        System.out.println(f);         //2 cause repeated twice*/


        //Disjoint -> check if two list
        /*List<String> newlist = Arrays.asList("Virat","Sachin sir","Sir vivavan Richards");
        boolean disjoint = Collections.disjoint(cricketers, newlist);
        System.out.println(disjoint);   //true means no common

        //copying conent from one list to another
        List<String> copycricketers = new ArrayList<>(Collections.nCopies(cricketers.size(),""));
        Collections.copy(copycricketers,newlist);
        System.out.println(copycricketers);*/

        //Replace all element from a single value
//        Collections.fill(cricketers,"Dhoni Bhai");
//        System.out.println(cricketers);

        //Synchronized Collection
        Collection<String> synchronizedcollection =   Collections.synchronizedCollection(new ArrayList<>(cricketers));
        System.out.println(synchronizedcollection);








    }
}
