package Exception_Handling.Throw;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThowWithChecked {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("abc.java");
        } catch (Exception e) {
            System.out.println("Original Exception: " + e);
        }
            // checked exception Throwing
            try {
                throw new FileNotFoundException("FILE IS NOT THERE");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }


