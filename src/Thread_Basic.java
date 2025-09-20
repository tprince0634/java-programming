public class Thread_Basic {
    public static void main(String[] args) {

        //Thread using Lambda
        Thread  thread = new Thread(()->{
            for(int i =0; i<=5;i++){
//                a.put(i,"Thread1");
            }
        });


        //Thread using Lambda
        Runnable runnable = () -> {
            System.out.println("Runnable running using Lambda Expression");
        };





        //Anonymous Thread
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Thread");
            }
        });
        thread1.start();




        //Anonymous Thread
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous using Runnable");
            }
        };
        Thread thread2 =new Thread(runnable2);
        thread2.start();




    }
}
