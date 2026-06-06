package Exception_Handling.ExceptionPropagation;

public class Demo {

/* Exception propagation means an exception travels from the method where it occurred to the method
 that called it, until it is handled
"Exception propagation is the process by which an exception moves from the method where it is
 thrown to the calling methods until it is caught and handled.*/


    static void m3() {
        int x = 10 / 0;   // Exception occurs here
    }

    static void m2() {
        m3();
    }

    static void m1() {
        m2();
    }

    public static void main(String[] args) {

        try {
            m1();
        } catch (ArithmeticException e) {
            System.out.println("Exception Handled");
        }
    }
}

/*
Exception propagation is the process where an exception moves from the method in which it occurs
 to the calling methods until it is handled. In the example, ArithmeticException occurs in m3()
 due to 10/0. Since m3() does not handle it, the exception propagates to m2(), then to m1(),
 and finally to main(), where it is caught by the catch block. This passing of the exception
 up the call stack is called exception propagation.*/
