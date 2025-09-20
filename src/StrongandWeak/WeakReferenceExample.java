package StrongandWeak;

import javax.print.attribute.standard.JobKOctets;
import java.lang.ref.WeakReference;

public class WeakReferenceExample {
    public static void main(String[] args){

        Object num = new Object();
        WeakReference<Object> weakRef = new WeakReference<>(num);

        System.out.println("Before GC: " + weakRef.get());             // Should print the object
      //  num = null;
        System.gc();
        System.out.println("After GC: " + weakRef.get());             // Should print null if garbage collected
    }
}

// num is a strong reference — object is safe from GC
