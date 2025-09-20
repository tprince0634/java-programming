package Collection.Map.ImmutableMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Sample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4, "Four");
        map.put(4,"Five");

        Map<Integer, String> map2 = Collections.unmodifiableMap(map);
        System.out.println(map2);  // you can only read

//       map2.put(5,"Five");  //This will give error (Map 2 is unmodifiableMap so you can not make change)
         map.put(5,"Five");  //here we can add so there is not benifit of unmodifiable
        System.out.println(map2);  // so extension aaya


        Map<Integer, String>  map3 = Map.of(1, "A", 2, "B", 3, "c", 4, "D");
       // map3.put(2,"a"); Throws Exception
       // map3.remove(1,"a");
        System.out.println(map3);
// Map.of is good but only 10 value can store in to this (SO THERE IS A IMPLEMENTATION)

        Map<Integer, String> map5 = Map.ofEntries(Map.entry(11, "Abhi"), Map.entry(12, "Vivek"), Map.entry(13, "Vivan"));
        // map5.put(2,"a"); Throws Exception
        System.out.println(map5);


    }

}
