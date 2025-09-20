package Knowledge;

public class Demo {
    //Refer Threading/Advance/ThreadCommunication
    /**
     * package Threading.Advance.ThreadCommunication;
     *
     * public class SharedResource {
     *     private int data;
     *     private boolean hasData = false;
     *
     *     public synchronized void produce(int value) {
     *         while (hasData) {
     *             try {
     *                 wait();    // Wait for consumer to consume
     *             } catch (InterruptedException e) {
     *                 Thread.currentThread().interrupt();
     *             }
     *         }
     *
     *         data = value;
     *         hasData = true;
     *         notify();  // Notify consumer  (Data hai consume karo)
     *     }
     *
     *    public synchronized int consume(){
     *         while (!hasData){
     *             try{
     *                 wait();     // Wait for producer to produce
     *             }catch (InterruptedException e){
     *                 Thread.currentThread().interrupt();
     *             }
     *         }
     *         hasData=false;
     *         notify();   //Notify producer Data nhi hai produce karo
     *         return data;
     *
     *    }
     * }
     *
     * class Producer implements  Runnable{
     *     private SharedResource resource;
     *
     *     Producer(SharedResource resource){
     *         this.resource=resource;
     *     }
     *
     *     @Override
     *     public void run() {
     *         for(int i=0;i<10;i++){
     *             resource.produce(i);
     *             System.out.println("Produced " +i);
     *         }
     *
     *     }
     * }
     *
     * class Consumer implements Runnable{
     *     private SharedResource resource;
     *
     *     private Consumer(SharedResource resource){
     *         this.resource=resource;
     *     }
     *
     *     @Override
     *     public void run() {
     *         for(int i=0;i<10;i++){
     *             int consume = resource.consume();
     *             System.out.println("Consumed" + consume);
     *         }
     *
     *     }
     *
     *     public static void main(String[] args) {
     *         SharedResource resource = new SharedResource();
     *         Producer p = new Producer(resource);
     *         Thread t = new Thread(p);
     *
     *         Consumer c = new Consumer(resource);
     *         Thread t2 = new Thread(c);
     *
     *         t.start();
     *         t2.start();
     *
     *
     *     }
     * }*/
}
