package ThreadingByAman.DeadLock.TryLockDemo.Problem;

public class Demo {
    private  int balanace = 5000;

    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Trying to withdraw " + amount);
        if(amount <=  balanace){
            System.out.println(Thread.currentThread().getName() + " In process ");

            Thread.sleep(20000);

            balanace = balanace - amount;
            System.out.println(Thread.currentThread().getName() + " Succesfully withdrawled " + amount + " Remaning Balance  is :" + balanace);

        }else {
            System.out.println(Thread.currentThread().getName() + " Insuffient Balance ");
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

        Thread thread1 = new Thread(()->{
            try {
                demo.withdraw(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread1");



        Thread thread2 = new Thread(()->{
            try {
                demo.withdraw(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread2");
        thread1.start();
        thread2.start();
    }
}
