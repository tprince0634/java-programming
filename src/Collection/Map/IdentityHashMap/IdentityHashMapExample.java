package Collection.Map.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {



        IdentityHashMap<String, String> identityMap = new IdentityHashMap<>();

        // Two different String objects with same content
        String key1 = new String("hello");
        String key2 = new String("hello");

//        String key1 = "hello";
//        String key2 = "hello";

        identityMap.put(key1, "Value1");
        identityMap.put(key2, "Value2");  //override  if  -> String key1 = "hello";

        System.out.println("IdentityHashMap size: " + identityMap.size());
        System.out.println("IdentityHashMap content: " + identityMap);

//----------------------------------------------------------------------------------------------------
        /**
         * key1 == key2        // false → different memory locations
         * key1.equals(key2)   // true → same value
         * */
// -----------------------------------------------------------------------------------------------------
       HashMap<String, String> hashMap = new HashMap<>();
       hashMap.put(key1, "Value1");
       hashMap.put(key2, "Value2");  //override cause same content

        System.out.println("HashMap size: " + hashMap.size());
        System.out.println("HashMap content: " + hashMap);



    }
}