package String_Buffer_Builder;
import java.util.Date;


import java.util.Date;

public class Formatestring {
    public static void main(String[] args) {

        String formatstring = String.format("This is the %d" , 100);
        System.out.println(formatstring);

        String formatstring2 = String.format("This is the %f" , 100f);
        System.out.println(formatstring);


        Date date = new Date();
        String formattedDate = String.format("Today is: %tD", date);  // Date in MM/DD/YY format
        System.out.println(formattedDate);            // Output: Today is: 04/30/25

    }
}
