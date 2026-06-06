package Collection.Map.SortedHashMap;
import java.util.*;

public class Demo1 {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        map.firstKey();
        map.lastKey();
        SortedMap <Integer, String> a =   map.headMap(2);
        SortedMap <Integer, String> b  =  map.tailMap(2); // These are the extra methods provided by sorted interface
        System.out.println(map);
        System.out.println(a);
        System.out.println(b);

    }
}
/*
SortedMap = Map + sorted keys
key are always sorted automatically
Sorting:
Natural (1,2,3…)
Or custom comparator
*/
