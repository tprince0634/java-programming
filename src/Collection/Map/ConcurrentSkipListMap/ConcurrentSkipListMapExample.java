package Collection.Map.ConcurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {
    public static void main(String[] args) {
        // Creating a ConcurrentSkipListMap with String keys and Integer values
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();

        // Adding key-value pairs to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);

        // Printing the map
        System.out.println("Map: " + map);

        // Getting a value for a specific key
        System.out.println("Value for 'Banana': " + map.get("Banana"));

        // Checking if a key exists
        System.out.println("Contains key 'Apple': " + map.containsKey("Apple"));

        // Removing a key-value pair
        map.remove("Cherry");
        System.out.println("Map after removing 'Cherry': " + map);

        // Navigational methods
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("Key higher than 'Banana': " + map.higherKey("Banana"));
        System.out.println("Key lower than 'Banana': " + map.lowerKey("Banana"));

        // Submap (portion of the map)
        System.out.println("Submap from 'Apple' to 'Date': " + map.subMap("Apple", "Date"));
    }
}
