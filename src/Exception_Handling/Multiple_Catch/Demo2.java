package Exception_Handling.Multiple_Catch;

public class Demo2 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------");
        try {
            String B = "Abhi";
            int f = Integer.parseInt(B);
            System.out.println(f);
        } catch (Exception s) {
            System.out.println(s);
        } /* catch (NumberFormatException d){
            System.out.println("SORRY");
      }*/

    }
}
