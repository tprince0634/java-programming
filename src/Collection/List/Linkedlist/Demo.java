package Collection.List.Linkedlist;


import java.util.Arrays;
import java.util.LinkedList;

public class Demo {
    public static  void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.get(1);
        list.remove(1);

        list.addFirst(0);
        list.addLast(5);
        list.getFirst();
        list.getLast();
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        LinkedList<String > list1= new LinkedList<>(Arrays.asList("Cat","Dog","Elephant","Goat"));
        LinkedList <String> list1toremove = new LinkedList<>(Arrays.asList("Goat"));
        list1.removeAll(list1toremove);
        System.out.println(list1);
    }
}
