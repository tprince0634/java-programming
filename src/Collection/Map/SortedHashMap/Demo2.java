package Collection.Map.SortedHashMap;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {

        SortedMap<Integer, String> map =
                new TreeMap<>((a, b) -> Integer.compare(b, a));

        map.put(1, "A");
        map.put(3, "C");
        map.put(2, "B");

        System.out.println(map);
    }
}

/*
custom comparator, you can completely control how the keys are arranged.
In this case, the comparator reverses the natural ordering, so the keys are stored in descending order
instead of ascending.
It demonstrates that the TreeMap is flexible and allows custom sorting logic while still maintaining
sorted data automatically.*/
