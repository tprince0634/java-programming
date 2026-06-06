package Collection.Comparator2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo3 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
    }

    /*
    If o2 > o1 → positive → o1 goes after
    If o2 < o1 → negative → o1 comes before
    */



    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(0);

        list.sort(new Demo3());           //According to Compare method
        System.out.println(list);

    }
}



