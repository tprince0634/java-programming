package Threading.Basic.Methods;
// sleep(milliseconds)	Pauses the thread for a given time. It goes into TIMED_WAITING state.

public class M2 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<=5 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        M2 m2 = new M2();
        m2.start();
    }
}
