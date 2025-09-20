package Threading.Basic.Methods;
//setName(String name)
//getPriority() / setPriority(int priority)
//Gets or sets the thread's priority (range: 1–10).

public class M4 extends Thread {
    M4(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " - Priority: " + Thread.currentThread().getPriority() +  " - Count" + i);
        }
    }

    public static void main(String[] args) {
        M4 low = new M4("low Priority");
        M4 medium = new M4("Medium priority");
        M4 High = new M4("High Priority");

        low.setPriority(Thread.MIN_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        High.setPriority(Thread.MAX_PRIORITY);

        low.start();
        medium.start();
        High.start();


    }
}
