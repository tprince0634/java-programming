package String_Family.ThreadSafety;

public class Demo3 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();                  //NOT THREAD Safe


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("A");
            }
        });


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("B");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {

        }
        System.out.println(stringBuilder.length());
//       System.out.println(stringBuffer.capacity());

    }
}
