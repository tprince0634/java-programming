package Collection.Map.SortedHashMap;

import java.util.*;
//Navigable map extends Sorted map both are interfaces

public class SortedDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> a = new TreeMap<>();
        a.put(18,"Virat");
        a.put(7,"Dhoni");
        a.put(88,"Ready");
        a.put(50,"Padya");
        System.out.println(a.floorKey(46));
        System.out.println(a.tailMap(20));



     }

}



