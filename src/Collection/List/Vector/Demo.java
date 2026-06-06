package Collection.List.Vector;


import java.util.LinkedList;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        System.out.println("Initial capacity By default" + " " +  vec.capacity());


        Vector<Integer> vec1 = new Vector<>(1,3);
        vec1.add(1);
        vec1.add(1);
        vec1.add(0,3);
//Correct! The value 3 will not override the existing 1 at index 0. Instead,
// it will insert the value 3 at the beginning of the vector, shifting the other elements to the right.
        System.out.println(vec1);
        System.out.println("Capacity After  increment by 3 and initial set to 1 :  " + " " + vec1.capacity());


        // Create a Collection.List.List.Vector
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Banana");
        // Accessing elements
        System.out.println("First element: " + vector.get(0)); // Output: Apple
        // Removing an element
        vector.remove("Banana");  //Only first occurance
//      vector.remove(1);

/**
 * // Remove all occurrences of "Banana"
 * while (vector.contains("Banana")) {
 *     vector.remove("Banana");
 * }
 * */


        // Iterating through the Collection.List.List.Vector
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Size and capacity
        System.out.println("Size: " + vector.size()); // Output: 3
        System.out.println("Capacity: " + vector.capacity()); // Output: 10 (default capacity)

        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        Vector<Integer> v1 = new Vector<>(linkedList); //This is how we can pass a collection in it
        System.out.println(v1);




    }
}
