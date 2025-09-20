package Accessmodifiers.Private;

public class Myclasstest {
    public static void main(String[] args) {
        Myclass  myclass = new Myclass();
      //  System.out.println(myclass.a);   you can not access private variable It is .
        myclass.setA("Ajay");
        myclass.setB("Yadav");
        System.out.println(myclass.getA());
        System.out.println(myclass.getB());

//        myclass.accessPrivate();   //  you can not access private Method  It is .
    }
}
