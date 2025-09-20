package FFF.Finalize;

public class GarbageCollectorExample {

    // A simple class to demonstrate garbage collection
    static class MyObject {
        String name;

        MyObject(String name) {
            this.name = name;
        }


        protected void finalize() throws Throwable {
            // This method is called by the garbage collector before the object is removed from memory
            System.out.println("Garbage Collector is collecting: " + name);
        }
    }

    public static void main(String[] args) {
        // Creating objects
        MyObject obj1 = new MyObject("Object 2");
        MyObject obj2 = new MyObject("Object 2");

        // Nullifying references to make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Suggesting the JVM to run the garbage collector
        System.out.println("Requesting garbage collection...");
        System.gc();

        // Adding a small delay to allow the garbage collector to run
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
    }
}
