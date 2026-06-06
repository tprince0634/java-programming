package Collection.List.Vector;
import java.util.Vector;

public class Methods {
    public static void main(String[] args) {


        // Create Vector with initial capacity 10
        Vector<Integer> v2 = new Vector<>(10);

        // 🔹 Adding elements
        v2.add(1);
        v2.add(2);

        // Insert element at specific index
        v2.add(2, 33);   // index 2 → value 33
        System.out.println("After adding elements: " + v2);
        // Output: [1, 2, 33]

        // 🔹 Update element at index
        v2.set(2, 4);   // replace 33 with 4
        System.out.println("After updating index 2: " + v2);
        // Output: [1, 2, 4]

        // 🔹 Add duplicate element
        v2.add(1);
        System.out.println("After adding duplicate: " + v2);
        // Output: [1, 2, 4, 1]

        // 🔹 Remove first occurrence of value 1
        v2.remove(Integer.valueOf(1));
        System.out.println("After removing first '1': " + v2);
        // Output: [2, 4, 1]

        // 🔹 Size of vector
        System.out.println("Size: " + v2.size());

        // 🔹 Check if empty
        boolean isEmpty = v2.isEmpty();
        System.out.println("Is empty? " + isEmpty);

        // 🔹 Loop through elements
        System.out.println("Elements using loop:");
        for (int i = 0; i < v2.size(); i++) {
            System.out.println("Index " + i + " → " + v2.get(i));
        }

    }
}

