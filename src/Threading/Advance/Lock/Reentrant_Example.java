package Threading.Advance.Lock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Reentrant_Example {
   Lock lock = new ReentrantLock();


    public void outer(){
        lock.lock();
        try{
            System.out.println("Outer");
            inner();                        //Deadlock condition so Reentrant lock  comes in picture(because single thread acquire same lock)
        }catch (Exception e){
            System.out.println(e);
        }finally {
            lock.unlock();
        }
    }

//✅ This works because ReentrantLock allows the same thread to acquire the lock multiple times.
//    Lock release hoga jb har ek lock match hoga with its unlock

    public void inner(){
        lock.lock();
        try{
            System.out.println("Inner");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        Reentrant_Example r = new Reentrant_Example();
        r.outer();

    }
}


/**It’s called "reentrant" because:

 ✅ A thread that already holds the lock can acquire it again without getting blocked.*/



