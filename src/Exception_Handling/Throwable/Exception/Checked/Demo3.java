package Exception_Handling.Throwable.Exception.Checked;

import java.util.concurrent.Callable;

public class Demo3 {
    public static void main(String[] args)  {
        try{
            Class.forName("Abc");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
