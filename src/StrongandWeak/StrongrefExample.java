package StrongandWeak;

public class StrongrefExample {
    public static void main(String[] args) {


                Object obj = new Object();
                System.out.println("Object created and strongly referenced.");
                System.out.println("Before nullifying, obj: " + obj);

              //  obj = null;           // Now the object can be garbage collected
                System.gc();
                System.out.println("After nullifying, obj: " + obj); // This will print null
            }
        }

