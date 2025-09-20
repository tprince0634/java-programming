package FFF.Final;

//THIS CLASS  BELONG TO THE EXAMPLE OF (FINAL STATIC  INSTANCE VARIABLE).


public class Apple {
    //At declaration
    static final int a = 11;

    static final int b;
    // There is only Two way to initialized Through (Static initialized block)
    static {
        b=10;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }


}
