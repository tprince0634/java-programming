package Exception_Handling.TrywithResources.OldWay;
class MyResource implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Resource Closed");
    }
}

public class Demo {
    public static void main(String[] args) {

        try (MyResource r = new MyResource()) {

            System.out.println("Working...");
            int x = 10 / 0;   // Exception

        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}

//In try-with-resources, the close() method is executed automatically even if an exception occurs.
// Java closes the resource first and then transfers control to the catch block.