package Collection.Comparator2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo3 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
          return o1-o2;        //ascending
//        return o2 - o1 ;  //descending
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(0);

//      list.sort(null);                  //Use only of your class extend Comparator
        list.sort(new Demo3());           //According to Compare method  @override
        System.out.println(list);

    }

}



