package Collection.Map.LinkedHashMap;
import java.util.LinkedHashMap;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

//  LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
    public LRUCache(int capacity) {
        // Super constructor calls the LinkedHashMap constructor with initial capacity, load factor, and access order
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }


    // Override the removeEldestEntry method to implement the LRU Cache eviction policy
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K,V> eldest) {
        // Remove the eldest entry if the map size exceeds the capacity
         return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> stu = new LRUCache<>(3);

        // Adding some key-value pairs to the LRUCache
        stu.put(1, "A");
        stu.put(2, "B");
        stu.put(3, "C");
        stu.put(4, "D");

//        stu.put(1,"AA");


        // Printing the LRUCache contents
        System.out.println(stu);
    }
}