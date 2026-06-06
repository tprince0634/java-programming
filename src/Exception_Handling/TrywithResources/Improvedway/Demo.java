package Exception_Handling.TrywithResources.Improvedway;

/*“Try-with-resources in Java is a feature introduced in Java 7 for automatic resource management.
  It allows us to declare resources like file streams or database connections inside the try block,
   and the JVM automatically closes them at the end of the block. This works because the resources
   implement the AutoCloseable interface, which provides the close() method.
   For example, FileReader doesn’t directly implement AutoCloseable, but it inherits it through
   Reader → Closeable → AutoCloseable. Internally, the compiler converts try-with-resources
   into a try-finally block where the close() method is called automatically, preventing memory leaks
   and improving code readability.”*/


import java.io.FileReader;
import java.io.IOException;

//You know it's a try-with-resources because the resource is declared inside the parentheses () after try.

public class Demo {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("src/Exception_Handling/TrywithResources/Demo2.java")) {
            int data = fileReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

}
