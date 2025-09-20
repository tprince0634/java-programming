package Accessmodifiers.Public;

/**
 Public Access Modifier
 The public access modifier allows access to the member (method or variable) from anywhere,
 both within and outside the class  as well as package .
 */


public class Simple {

    public int x = 10;

     public  void myMethod(){
        System.out.println("HELLO");
    }

    public static void main(String[] args) {
        Simple a = new Simple();
        System.out.println(a.x);
        a.myMethod();
    }
}

//Refer simple test another class  (access from outside the class )
//Refer simple test2 another package   (access from outside the Package )
