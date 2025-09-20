package ThreadingByAman.DeadLock.Problem;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class Demo {
    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            try {
                if(lock1.tryLock(1,TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName() + " locked Resource 1");

                    try{
                        Thread.sleep(200);
                        if(lock2.tryLock(1,TimeUnit.MILLISECONDS)){
                            try{
                                System.out.println(Thread.currentThread().getName() + " locked Resource 2");
                            }finally {
                                lock2.unlock();
                                System.out.println(Thread.currentThread().getName() + " released Resource 2");
                            }
                        }else {
                            System.out.println(Thread.currentThread().getName() + " couldn't lock Resource 2");
                        }
                    }finally {
                        lock1.unlock();
                        System.out.println(Thread.currentThread().getName() + " released Resource 1");
                    }
                }else {
                    System.out.println(Thread.currentThread().getName() + " couldn't lock Resource 1");
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        });



        Thread thread2 = new Thread(() -> {
            try {
                if (lock2.tryLock(1, TimeUnit.SECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " locked Resource 2");

                    try {
                        Thread.sleep(100); // Simulate work
                        if (lock1.tryLock(1, TimeUnit.SECONDS)) {
                            try {
                                System.out.println(Thread.currentThread().getName() + " locked Resource 1");
                                // Do work with both resources
                            } finally {
                                lock1.unlock();
                                System.out.println(Thread.currentThread().getName() + " released Resource 1");
                            }
                        } else {
                            System.out.println(Thread.currentThread().getName() + " couldn't lock Resource 1");
                        }
                    } finally {
                        lock2.unlock();
                        System.out.println(Thread.currentThread().getName() + " released Resource 2");
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " couldn't lock Resource 2");
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }, "Thread2");

        thread1.start();
        thread2.start();
    }
}
