package String_Immutable;

public class Demo {
    public static void main(String[] args) {

        /**
         * 🔥 Important Notes:
         * Immutability means the object "Hello" cannot be modified.
         * It does not mean the reference (variable) is constant!
         * The variable immutablestring is free to point to a different object.
         * */

        /**
         * ✅ String literals are not garbage collected because:
         * They are managed specially by the JVM.
         * The String Pool is designed to keep all string literals for the lifetime of the program.
         * Even if no variable references it, the literal itself remains in the pool.
         * */


        String s1 = "Hello";
//        s1.concat("fmf");        //ignored cause string in immutable

        //String pool

        String s2 = s1.concat( " World");
        //.concat heap memory

        String s3 = s1.concat( " World").intern();
        // .intern string pool

        String  s4 = new String("Hello world");
        //heap

        String s5 = "Hello World";
        System.out.println(s5 == s3);





    }
}
