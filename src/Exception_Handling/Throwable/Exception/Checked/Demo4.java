package Exception_Handling.Throwable.Exception.Checked;

public class Demo4 {
    public static void main(String[] args) {
        // 9. Checked: InterruptedException (simulated)
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Caught InterruptedException");
        }
    }
}
