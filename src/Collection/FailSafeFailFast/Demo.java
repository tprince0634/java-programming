package Collection.FailSafeFailFast;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        // Example : such as ArrayList, HashSet, HashMap are Fail-Fast.
        System.out.println("Fail-Fast Iterator Example:");
        List<String> fastList = new ArrayList<>();
        fastList.add("Mango");
        fastList.add("Banana");
        fastList.add("Apple");

        try {
            for (String fruit : fastList) {
                if (fruit.equals("Banana")) {
                    fastList.add("Orange"); // 🚨 Will throw ConcurrentModificationException
                }
                System.out.println(fruit);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("List after iteration: " + fastList);
    }
}
