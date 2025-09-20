package Collection.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache2 extends LinkedHashMap<Integer, String> {
    private final int capacity;

    public LRUCache2(int capacity) {
        super(capacity, 0.7f, true); // true for access order
        this.capacity = capacity;
    }
// By using super(), you are invoking the constructor of the LinkedHashMap class to initialize
// the LinkedHashMap part of the LRUCache2 object.

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache2 l = new LRUCache2(3);
        l.put(1, "One");
        l.put(2, "Two");
        l.put(3, "Three");
        l.put(4, "Four");
        l.put(5, "Five");

        System.out.println(l);
    }
}
