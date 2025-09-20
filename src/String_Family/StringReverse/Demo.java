package String_Buffer_Builder.StringReverse;

import javax.print.DocFlavor;

public class Demo {
    public static void main(String[] args) {
        /*The common approach to reverse a string in Java is by using either StringBuilder or StringBuffer along with their reverse() method*/

        String reversed= new StringBuilder("hungryCoders").reverse().toString();
        System.out.println(reversed); //sredoCyrgnuh


        String reversedd= new StringBuffer("hungryCoders").reverse().toString();
        System.out.println(reversedd); //sredoCyrgnuh










    }
}
