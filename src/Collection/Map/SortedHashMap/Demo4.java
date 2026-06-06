package Collection.Map.SortedHashMap;

import java.util.*;

public class Demo4 {
    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");

        System.out.println(map.floorKey(25));   // 20
        System.out.println(map.ceilingKey(25)); // 30
        System.out.println(map.lowerKey(20));   // 10
        System.out.println(map.higherKey(20));  // 30
    }
}
/*
What is NavigableMap?
NavigableMap = SortedMap + navigation
*/