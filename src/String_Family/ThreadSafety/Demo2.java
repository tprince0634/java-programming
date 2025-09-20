package String_Family.ThreadSafety;
//This example shows the thread safety of a builder and buffer

public class Demo2 {

    public static void main(String[] args) {
       StringBuffer stringBuffer = new StringBuffer();                      //THREAD Safe

        Thread thread1 = new Thread(()->{
            for(int i=0 ;i< 1000;i++){
                  stringBuffer.append("A");
            }
        });


        Thread thread2 = new Thread(()->{
            for(int i=0 ;i< 1000;i++){
                 stringBuffer.append("A");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {

        }
      System.out.println(stringBuffer.length());
    }
}
