package Collection.Map.WeakHashMap;

public class GC {
    int num = 10;


    @Override
    protected void finalize() {
        System.out.println("GC object with num=" + num + " is being garbage collected.");
    }

    public static void main(String[] args) {
        GC gc1 = new GC();
        GC gc2 = new GC();

        // Printing before making objects eligible for GC
        System.out.println("Before GC: gc1.num = " + gc1.num);
        System.out.println("Before GC: gc2.num = " + gc2.num);

        // Now, make the objects eligible for garbage collection
        gc1 = null;
        gc2 = null;  // gc2 is no longer referenced, it becomes eligible for GC



        System.gc();
        // Wait for a brief moment to let GC happen (in practice, it's not needed)
        try {
            Thread.sleep(1000); // Sleep for 1 second to give GC a chance to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(gc1);
        System.out.println(gc2);


        // At this point, gc1 and gc2 should be eligible for garbage collection
        System.out.println("End of main method.");
    }
}
