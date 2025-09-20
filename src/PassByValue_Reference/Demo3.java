package PassByValue_Reference;
//pass by value with primitive
public class Demo3 {
    public static void main(String[] args) {
        int x = 1;                                      //Argument                 // original value
        increment(x);
        System.out.println("original: " + x);
    }

    public static void increment(int x){                       //parameter
        //The method receives a copy of the argument passed.
        x++;                                        // Changes to the parameter do not affect the argument.
        System.out.println(x);
    }

}

