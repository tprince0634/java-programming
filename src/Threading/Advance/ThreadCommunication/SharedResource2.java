package Threading.Advance.ThreadCommunication;

public class SharedResource2 {

    private  int data;
    private  boolean hasData;


    public synchronized void producer(int data){
        while(hasData){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        this.data=data;
        hasData=true;
        notify();   // Notify consumer  (Data hai consume karo)
    }
    
    
    public synchronized int consumer() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        notify(); //to producer to produce
        return data;

    }


    public static void main(String[] args) {
        SharedResource2 sr = new SharedResource2();

        Thread thread1 = new Thread(()->{
            for(int i=0;i<10;i++){
                sr.producer(i);
                System.out.println("Produced" + i);
                try {
                    Thread.sleep(500); // Simulate time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    int consumer = sr.consumer();
                    System.out.println("Consumed " + consumer);
                    try {
                        Thread.sleep(500); // Simulate time
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
