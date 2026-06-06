package ThreadingByAman.Basic.Volatile;

import Opps.Abstraction.FirstWay.Example2.MyAtm;

class MyThread extends Thread {

   volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("hello");
        }
        System.out.println("Thread stopped");
    }

    public static void main(String[] args) throws Exception {

        MyThread t = new MyThread();
        t.start();
        Thread.sleep(3000);
        System.out.println("Changing running to false");
        t.running = false;
    }
}