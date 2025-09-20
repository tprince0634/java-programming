package Collection.Map.ConcurrentHashMap;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
    public static void main(String[] args) {

                // Create an AtomicInteger with an initial value of 10
                AtomicInteger atomicInt = new AtomicInteger(10);

                // Perform a CAS operation to compare the current value with 10 and set it to 20
                boolean success = atomicInt.compareAndSet(10, 20);
                // Check if the CAS operation was successful
                System.out.println("CAS operation successful: " + success);
                System.out.println("New value of atomicInt: " + atomicInt.get());

                // Perform another CAS operation that will fail (because the value is now 20)
                success = atomicInt.compareAndSet(10, 30);
                System.out.println("CAS operation successful: " + success);
                System.out.println("New value of atomicInt: " + atomicInt.get());
            }
        }




