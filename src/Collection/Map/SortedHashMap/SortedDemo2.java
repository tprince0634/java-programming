package Collection.Map.SortedHashMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedDemo2 {

   static class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return b - a;  // Sort in decending order
        }
    }


    public static void main(String[] args) {
        // Using a TreeMap with custom comparison
//        SortedMap<Integer, String> map = new TreeMap<>();   //natural ordering

//        SortedMap<Integer, String> map = new TreeMap<>(new CustomComparator());
          SortedMap<Integer,String > map = new TreeMap<>((a,b) -> b -a);
          map.put(773, "Akbar");
          map.put(19, "Allahudin");
          map.put(17, "Kejriwal");
          map.put(8, "Awadh");

        // Print the map
        System.out.println(map);
    }
}

//you can pass Comparator in the constructor in both waysa