package Collection.Map.ImmutableMap;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ThreadSafetyExample {
    public static void main(String[] args) throws InterruptedException {
        // Create an ImmutableMap
     HashMap<String,Integer> map = new HashMap<>();
     map.put("Apple", 500);
     map.put("Mango", 600);
     map.put("Banana",400);


        Map<String, Integer> map2 = Collections.unmodifiableMap(map);
        System.out.println(map2);  // if you will not write this it will become non thread safe

        // Simulate concurrent threads accessing the ImmutableMap
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " accessed: " + map.get("Apple"));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " accessed: " + map.get("Banana"));
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();
    }
}
