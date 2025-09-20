package ThreadingByAman.DeadLock.TryLockDemo.Solution;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {
    private  int balanace = 5000 ;

    Lock lock = new ReentrantLock();

    public void withdraw(int amount)  {
        System.out.println(Thread.currentThread().getName() + " Trying to withdraw " + amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){

                try{
                    if(amount <=  balanace){
                        System.out.println(Thread.currentThread().getName() + " In process ");
                        Thread.sleep(3000);
                        balanace = balanace - amount;
                        System.out.println(Thread.currentThread().getName() + " Succesfully withdrawled " + amount + " Remaning Balance  is :" + balanace);
                    }else {
                        System.out.println(Thread.currentThread().getName() + " Insuffient Balance ");
                    }
                }catch (Exception e){
                    System.out.println(e);
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " Could not Acquire Lock Try Again ");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    public static void main(String[] args) {
        Demo demo = new Demo();

        Thread thread1 = new Thread(()->{
            demo.withdraw(50);
        },"Thread1");

        Thread thread2 = new Thread(()->{
            demo.withdraw(50);
        },"Thread2");

        thread1.start();
        thread2.start();
    }
}
