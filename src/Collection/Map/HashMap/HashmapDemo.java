package Collection.Map.HashMap;

import java.util.*;

public class HashmapDemo {
    public static void main(String[] args) {
        // Create HashMap
        HashMap<Integer, String> hasmap = new HashMap<>();
        hasmap.put(1, "Akshit");
        hasmap.put(2, "Babu");
        hasmap.put(3, "Ganesh");

//        hasmap.put(4, null);
//        hasmap.put(5, null);
//        hasmap.put(null, "Nitesh");     // Only one key can be null
//        hasmap.put(null, "Aj style");   // Only one key can be null

        // Print HashMap
        System.out.println(hasmap);

        // Retrieve value for key 3
        String Roll = hasmap.get(3);  // Pass key to get Value
        System.out.println(Roll);

        // Retrieve value for key 49 (non-existent key)
        String s = hasmap.get(49); // Not present, so it will give null
        System.out.println(s);

        // Check if a key is present
        boolean b = hasmap.containsKey(1) ;  // Check whether the key is present or not
        System.out.println(b);

        // Check if a value is present
        boolean b1 = hasmap.containsValue("Ganesh");   // Check whether the Value is present or not
        System.out.println(b1);

        // Get all keys from the map
        Set<Integer> keys = hasmap.keySet();
        System.out.println("Keys in the map: " + keys);

        // Print all keys and their associated values
        for (Integer key : keys) {
            System.out.println("Key: " + key + " | Value: " + hasmap.get(key));
        }


        // Modify the values to uppercase
        for (Map.Entry<Integer, String> entry : hasmap.entrySet()) {
            entry.setValue(entry.getValue().toUpperCase());
        }


        boolean isremoved = hasmap.remove(0, "kay kay  Memon");
        System.out.println(isremoved);




//-----------------------------------------------------------------------------------------------------
        List<Integer> l1 = Arrays.asList(2,3,4,5,6);
        boolean contains = l1.contains(3);     //o(n)  because  Linear search krega
        System.out.println(contains);

        System.out.println(hasmap.containsKey(3));  //o(1)  optimizing performace


        String a = hasmap.getOrDefault(6,"Not found");
        System.out.println(a);

        hasmap.putIfAbsent(3,"AKBAR");  // it will not replace because allredy there
//        hasmap.put(3,"AKBAR");  replace ho ga
        System.out.println(hasmap);





    }
}
