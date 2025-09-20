package ThreadingByAman.ThraedLocal.InheritableThreadLocal;


//InheritableThreadLocal is a subclass of ThreadLocal in Java that allows child threads
// to inherit the values of variables from their parent thread.

public class InheritableThreadLocalExample {
    public static void main(String[] args) {
        InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<>();
        threadLocal.set("Instagram");


        //child
       Thread thread = new Thread(() ->{
           System.out.println(threadLocal.get());
       });
       thread.start();

    }
}
