package Collection.Map.SortedHashMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String> deo = new TreeMap<>();
        deo.put(1,"a");
        deo.put(2,"b");
        deo.put(3,"c");
        deo.put(5,"d");
        System.out.println(deo.ceilingEntry(4));  //above if not matched
        System.out.println(deo.lowerEntry(7));
        System.out.println(deo.higherEntry(1));
        System.out.println(deo.subMap(1,4)); //Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive.

    }
}
