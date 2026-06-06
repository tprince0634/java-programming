package Exception_Handling.Throws;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Demo {

    public void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Demo d = new Demo();
        d.readFile();


       /* try{
            d.readFile();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Hello");*/

        System.out.println("Hello");
        //Not get executed because it is not handled
        // it is delegated to JVM Which print problem and get Terminated

    }

}



/*
Since main() is not handling it, the exception is passed to the JVM (Java Virtual Machine).
readFile() throws FileNotFoundException
        ↓
main() declares throws FileNotFoundException
        ↓
No method above main()
        ↓
JVM handles it
        ↓
JVM prints exception and terminates program*/
