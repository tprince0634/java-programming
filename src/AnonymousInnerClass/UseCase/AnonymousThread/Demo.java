package AnonymousInnerClass.UseCase.AnonymousThread;

public class Demo {
    public static void main(String[] args) {

        //Anonymous thread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is Annoymous Thread");
            }
        });
        thread.start();



//Lambda
        Thread thread1 = new Thread(()->{
             System.out.println("Running in a thread (lambda way)");
        });
         thread1.start();




        //Anonymous Runnable  inner Thread
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is Annoymous Runnable Thread");
            }
        };
        Thread thread3 = new Thread(runnable);
        thread3.start();



 //Lambda
        Runnable runnable1 = () -> {
            System.out.println("This is lambda OF Runnable interface");
        };
        Thread t5 = new Thread(runnable1);
        t5.start();



        Runnable runnable2 = () ->{
            System.out.println("Hello");
        };
        Thread thread2 = new Thread(runnable2);
        thread2.start();


    }
}
