package Collection.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String > linkedHashMap = new LinkedHashMap<>();
        System.out.println("LINKED HASHMAP");
        linkedHashMap.put(10,"Mango");
        linkedHashMap.put(30,"Strawberry");
        linkedHashMap.put(20,"Grapes"); // it maintain the order on the based of ( insertion) not like sorted hash map which based on natural order of keys
        for(Map.Entry<Integer, String> t :linkedHashMap.entrySet()){
            System.out.println(t);
        }


        HashMap<Integer,String> hs= new HashMap<>();
        System.out.println("HASHMAP");
        hs.put(10,"Mango");
        hs.put(20,"Strawberry");
        hs.put(30,"Grapes");
        for(Map.Entry<Integer, String> t :hs.entrySet()){
            System.out.println(t);
        }
//        Initial capacity , load factor , access Order
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);  // accessOrder = true
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.get(2);  // Access entry with key 2

// The iteration order will now be: 1 -> 3 -> 2, because 2 was accessed last
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
