package ThreadingByAman.Producer_Consumer;

import java.security.PublicKey;

public class Demo {

    private int data;
    private  boolean hasdata;

    public synchronized  void  producer(int data){
        while (hasdata){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }

        this.data=data;
        hasdata=true;
        notify();
    }

    public synchronized int consumer(){
        while (!hasdata){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }

        hasdata=false;
        notify();
        return data;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<= 10; i++){
                    demo.producer(i);
                    System.out.println("Produced" + i);
                    try {
                        Thread.sleep(500); // Simulate time
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++){
                    int consumer = demo.consumer();
                    System.out.println("consumed" + consumer);
                    try {
                        Thread.sleep(500); // Simulate time
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
        thread1.start();

    }


}


