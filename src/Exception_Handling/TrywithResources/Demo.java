package Exception_Handling.TrywithResources;

/*Try-with-resources is a feature for automatic resource management.
 It's used to automatically close resources that implement the AutoCloseable interface,
 such as streams, database connections, or sockets, at the end of a try block.*/


import java.io.FileReader;
import java.io.IOException;

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
