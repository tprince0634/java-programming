package Garbagecollection;

public class Demo {
    int a = 5;                      // This creates an Integer object containing the value 5


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Demo object is being garbage collected.");
    }


    public static void main(String[] args) throws InterruptedException {
        Demo a = new Demo();                    // Create a Demo object

        System.out.println("Value of a: " + a.a);
        a = null;



        System.gc();   // Suggests the JVM to run Garbage Collector (not guaranteed)

        Thread.sleep(1000); // Wait to let GC thread run

        System.out.println("End of main method.");

    }
}


/**
 *
 * Finalize Method: The finalize() method is overridden to print a message when the object is garbage collected.
 * However, it's important to note that the finalize() method is deprecated as of Java 9.

 * Garbage Collection Timing: Setting obj to null makes the Demo object eligible for garbage collection,
 * but it does not guarantee that the garbage collector will run immediately or
 that it will collect the object right away.
 The timing of garbage collection is determined by the Java Virtual Machine (JVM) and can vary.

 * Main Method Execution: The message "End of main method." will be printed immediately
 * after setting obj to null. The garbage collection process may not have completed by that
 * time, so you may not see the message from the finalize() method.
 * If you want to force garbage collection for demonstration purposes, you can call System.gc(),
 * but this is merely a suggestion to the JVM and does not guarantee immediate collection.*/
