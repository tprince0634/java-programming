package Immutable.DefensiveCopy;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    private final List<String> mylist;

    public Demo3(List<String> mylist) {
        this.mylist = new ArrayList<>(mylist);
    }

    public List<String> getMylist() {
        return new ArrayList<>(mylist);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Guava");

        Demo3 demo3 = new Demo3(list);
        System.out.println(demo3.getMylist());

        list.add("Banana");
        System.out.println(list);

        System.out.println(demo3.getMylist());

    }
}
