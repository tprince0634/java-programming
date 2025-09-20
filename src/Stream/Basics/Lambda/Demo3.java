package Stream.Basics.Lambda;

public class Demo3 {
    public static void main(String[] args) {



//Anonymous Thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is anonymous Thread");
            }
        });
//Lambda
        Thread t2 = new Thread(()->{
            System.out.println("This is lambda");
        });


        t1.start();
        t2.start();
    }
}
