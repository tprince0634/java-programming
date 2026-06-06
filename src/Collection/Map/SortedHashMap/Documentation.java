package Collection.Map.SortedHashMap;

public class Documentation {


 /*

     A Map in Java is a data structure that stores elements in key–value pairs, where each key
     is unique and used to retrieve its corresponding value efficiently.

     Building on this, the SortedMap interface extends Map and ensures that all keys are maintained
     in sorted order, either by their natural ordering (ascending order) or by a custom comparator
     provided at the time of creation.

     The NavigableMap interface further extends SortedMap and adds advanced navigation capabilities.
     In addition to maintaining sorted keys, it allows you to find the closest matching keys relative
     to a given key, such as the greatest key less than a given value, the smallest key greater
     than or equal to a value, and so on.
     It provides navigation methods like floorKey and ceilingKey, making it useful when sorte
     data and range-based operations are required.

     Finally, TreeMap is a concrete class that implements the NavigableMap interface
     (and therefore also SortedMap and Map). It stores key–value pairs in a sorted order using
     a self-balancing Red-Black Tree, which ensures that operations like insertion, deletion,
     and lookup are performed efficiently in logarithmic time. TreeMap does not allow null keys
     but allows null values, and it is not synchronized, meaning it is not thread-safe by default.
     It provides navigation methods like floorKey and ceilingKey, making it useful when sorted data
     and range-based operations are required.

     Simple Understanding
     SortedMap → gives sorting methods
     NavigableMap → gives navigation methods
     TreeMap → actually performs everything
      */
}