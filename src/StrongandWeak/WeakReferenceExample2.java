package StrongandWeak;

import java.lang.ref.WeakReference;
//no need to make null
public class WeakReferenceExample2 {
    public static void main(String[] args) {
        WeakReference<Object> weakRef = new WeakReference<>(new Object());     // Weak reference to a new object

        System.out.println("Before GC " + weakRef.get());          // May print the object


        System.gc();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After GC " + weakRef.get()); // May print null if the object was collected
    }
}

// No strong reference — object may be GC'd immediately