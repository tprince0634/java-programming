package Collection.FailSafeFailFast;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo2 {
    public static void main(String[] args) {

        //Examples : collections such as CopyOnWriteArrayList, ConcurrentHashMap in Java are Fail-Safe.

        System.out.println("Fail-Safe Iterator Example:");
        List<String> safeList = new CopyOnWriteArrayList<>();
        safeList.add("Mango");
        safeList.add("Banana");
        safeList.add("Apple");

        for (String fruit : safeList) {
            if (fruit.equals("Banana")) {
                safeList.add("Orange"); // ✔️ Safe, no exception
            }
            System.out.println(fruit);
        }
        System.out.println("List after iteration: " + safeList);

    }
}
