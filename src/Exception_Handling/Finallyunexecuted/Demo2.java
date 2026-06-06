package Exception_Handling.Finallyunexecuted;

public class Demo2 {
    public static void main(String[] args) {

        try{
            System.out.println("Inside try");
            while (true){
                System.out.println(7);
            }
        }finally {
            System.out.println("This will executed i m sure");
        }
    }
}
