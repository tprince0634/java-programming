package ObjectComparision;
//-128 to 127

public class Her {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        System.out.println(a==b);   //for int == compare there values

        Integer v = 45;
        Integer w = 45;
        System.out.println(v==w);   //It is Inside the inside the integer pool

        Integer s = new Integer(20);
        Integer t = new Integer(20);
        System.out.println(s==t);   //It is Inside the inside the integer pool but :
//      When you use new Integer(20), you are explicitly creating a new instance of the Integer class. This means two different objects are created in memory, even though they both represent the same value


        Integer m = new Integer(300) ;
        Integer n = new Integer(300) ;
        System.out.println(m==n);  //IT is Outside the integer Pool

//   .equals compare two content
        Integer x = new Integer(388) ;
        Integer y = new Integer(388) ;
        System.out.println(x.equals(y));

// because == compare reference  with object
        Integer xx = new Integer(388) ;
        Integer yy = new Integer(388) ;
        System.out.println(xx==yy);

//IT compare two reference  and both refer same object
        Integer f = 78;
        Integer j = f;
        System.out.println(f==j);

    }
}
