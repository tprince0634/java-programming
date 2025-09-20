package Exception_Handling.Throwable.Exception.Checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Checked: IOException
public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
            FileReader fr = new FileReader("abc.txt");
        }
}
