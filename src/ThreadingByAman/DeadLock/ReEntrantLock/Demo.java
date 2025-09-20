package ThreadingByAman.DeadLock.ReEntrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {

    Lock  lock = new ReentrantLock();

    public void Outer(){
        lock.lock();

        try{
            System.out.println(" Outer Method ");
            inner();                                     //Deadlock condition so Reentrant lock  comes in picture(because single thread acquire same lock)
        }finally {
            lock.unlock();
        }
    }


    public void  inner(){
        lock.lock();
        try{
            System.out.println(" Inner Method ");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.Outer();

    }
}

/*ReentrantLock allows the same thread to safely lock the same resource multiple times — which helps avoid deadlocks
 when a method calls another method that uses the same lock.*/

