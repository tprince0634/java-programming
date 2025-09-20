package FFF.Final;


public class Example {


//   (1) way At the time of Declaration
    final int  X =10;                                               //final instance variable

//   (2)way Through initialization block.
    final int Y;                                                    //final instance variable
    {
        Y=20;
    }

//  (3) way Through constructor

    final int Z ;
    Example(int a)
    {
        Z = a;
    }


    public static void main(String[] args)
    {
        Example obj = new Example(30); //constructor
        System.out.println(obj.X);
        System.out.println(obj.Y);
        System.out.println(obj.Z);
    }
}


