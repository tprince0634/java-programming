package Collection.List.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Samp4 {
    public static void main(String[] args) {
        List<Integer> name = new ArrayList<>();
        name.add(100);
        name.add(300);
        name.add(100);
        name.add(200);
        name.add(400);
        name.remove(2);                      //removing by index
        name.remove(Integer.valueOf(100));      //removing by object

        System.out.println("name" + name);
//--------------------------------------------------------------------------
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);


        List<Integer> list3 = List.of(5,6,7,8);
        list2.addAll(list3);
        //List3.addAll(list2); ERROR you can not anything in List.of (You can only modify)
        System.out.println(list2);

    }
}
