package Exception_Handling.Finallyunexecuted;

public class Demo {
    public static void main(String[] args) {
        try{
            for(int i=0;i<10;i++){
                if(i==5){
                    System.exit(0);
                }
                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Program terminated successfully");
        }
    }
}
