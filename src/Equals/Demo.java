package Equals;

public class Demo {
    public static void main(String[] args) {
        // ==   When used with primitive types, == compares the actual values.
        //with primitive
        int a = 5;
        int b = 8;
        System.out.println(a==b);


        //with Objects  compares the references (memory addresses) to check if they point to the same object.
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);           // Output: false (different objects in memory)


   //1. Object Class:
      //  equals() Method    By default, it behaves like ==, comparing object references.
        class MyClass2 {

        }
        MyClass2 obj1 = new MyClass2();
        MyClass2 obj2 = new MyClass2();
        System.out.println(obj1.equals(obj2));     // Output: false (default behavior)


   //Overridden Method:
   //Many classes, like String, Integer, and custom classes, override equals() to compare the actual content (state) of the objects.
        String ss1 = new String("hello");
        String ss2 = new String("hello");
        System.out.println(ss1.equals(ss2)); // Output: true (content is the same)



    }
}
