package Accessmodifiers.Private;

/**
 *  Private Access Modifier
 * The private access modifier restricts access to the member (method or variable)
 *  only within the same class. (Not even in Subclass)
 */

public class Myclass {
    private String a = "Prince";
    private String b = "Tiwari";


    private void sayHello(){
        System.out.println("This is private Method");
    }

//Below the way to access the private method in another class

   private void accessPrivate(){
        sayHello();                       // Accessible within the same class
    }


    //Only Through Getter and setter you  can access filed of Private  Accessors

    public void setA(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }


    public void setB(String b) {
        this.b = b;
    }

    public String getB() {
        return b;
    }



    public static void main(String[] args) {
        Myclass ob = new Myclass();
        System.out.println("Accessing from same class: " + ob.a);    // Accessing public variable
        System.out.println("Accessing from same class: " + ob.b);    // Accessing protected variable
        ob.accessPrivate();

    }

}


//  class  Subclass extends Myclass{
//    public static void main(String[] args) {
//        Subclass s = new Subclass();
//        System.out.println(s.a);    //Private does not allowed for subclass also
//        System.out.println(s.b);
//    }
//}

