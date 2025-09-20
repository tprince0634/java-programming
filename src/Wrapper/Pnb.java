package Wrapper;

public class Pnb {
    public static void main(String[] args) {


        int a = 5;                          //It is a primitive Datatype Not objet (Stored in Stack memory).
        Integer b = 55;                     //The Integer Class wraps the value of int datatypes and treat as object
//      Integer bb = Integer.valueOf(b);     // Returns wrapper classes to their corresponding primitives types  )

        int f = b;
//      b= b.intValue();                    //Returns the primitive value of the corresponding wrapper object
        System.out.println(b);


        boolean isadult = true; //Primitive
        Boolean isrich = true;  //Wraper class
        String g = "Head";        // This is (b) object so reference stored in stack and Object stored in Heap Memory.


        // ----------------------------------------------------------------------------------------------------------------

        int dd = 56;
        int e = 56;
        System.out.println(dd == e); // true, because they are primitive types and compared by value (With in range).

        // -------------------------------------------------------------------------------------------------------------

        Integer jan = 127;
        Integer feb = 127;
        System.out.println(jan == feb); // true, because a and b refer to the same cached object and (With in the Range)
//        (-128 to 127)


        Integer aa = 128;
        Integer bb = 128;
        System.out.println(aa == bb); // False, because a and b refer to the same cached object But (outside the range)
        System.out.println(aa.equals(bb));  //It will compare Value not References

        // Creating new Integer objects using the new keyword.
        Integer cad = new Integer(127);
        Integer daaa = new Integer(127);
        System.out.println(cad == daaa); // false, because c and d are different objects.
        System.out.println(cad.equals(daaa));  //Equals to is used to compare values not objects



        // ---------------------------------------------------------------------------------------------------

    }
}
