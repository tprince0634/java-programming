package FFF.Final;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {


        final List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Cherry");
        System.out.println("Original list " + fruits);

        fruits.set(1,"Mango");
        System.out.println("Updated list " + fruits );

//      fruits = new ArrayList<>();

          }
      }


/*✅ Conclusion:
In this program:
The keyword final is used with the list fruits, meaning:
You cannot reassign fruits to point to a new list (e.g., fruits = new ArrayList<>(); will cause a compile-time error ❌).
You can modify the contents of the list (e.g., add(), set() are allowed ✅).*/












