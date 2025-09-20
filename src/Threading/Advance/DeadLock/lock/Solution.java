package Threading.Advance.DeadLock.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    int balance = 500;
    Lock lock = new ReentrantLock();                //to avoid deadlock condition


    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " Attempt to Withdraw " + amount);

        try {
            if (lock.tryLock(400, TimeUnit.MILLISECONDS)) {       //wait krega till the given time
                // if(lock.tryLock()){            //           aya try kiya gaya mila to ok nhi to gaya
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " In the process of withdrawing " + amount);
                        Thread.sleep(1000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed withdrawal. Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();  //If you never call unlock(), other threads will be stuck forever — that's a deadlock.
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + "Insuffient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " " + "Could not acquire the lock will try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Solution bi = new Solution();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                bi.withdraw(50);
            }
        },"Thread1");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bi.withdraw(50);
            }
        },"Thread2");

        thread.start();
        thread1.start();



    }
}
