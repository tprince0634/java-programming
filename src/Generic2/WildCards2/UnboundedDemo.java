package Generic2.WildCards2;

import java.util.ArrayList;
import java.util.List;

public class UnboundedDemo {
    //Unknown
    public  void printList(List<?>list){
        for(Object a :list){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        //Unknown type you can pass any datatypes
        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(3);

        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");

        UnboundedDemo ud = new UnboundedDemo();
        ud.printList(list);
        ud.printList(list1);

       }
    }


 /*List<?> is an unbounded wildcard — it accepts a list of any type (Integer, String, Double, etc.).
Inside the method, elements are treated as Object because the exact type is unknown.

*/
