import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;


public class DelayedMessage implements Delayed {

    private String message;
    private long startTime;                      // time at which message is available

    public DelayedMessage(String message, long delayInSeconds) {
        this.message = message;
        this.startTime = System.currentTimeMillis() + delayInSeconds * 1000;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long delay = startTime - System.currentTimeMillis();
        return unit.convert(delay, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        if (this.startTime < ((DelayedMessage) other).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayedMessage) other).startTime) {
            return 1;
        }
        return 0;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedMessage> queue = new DelayQueue<>();

        queue.put(new DelayedMessage("Message 1 - Delay 3 sec", 3));
        queue.put(new DelayedMessage("Message 2 - Delay 1 sec", 1));
        queue.put(new DelayedMessage("Message 3 - Delay 5 sec", 5));

        System.out.println("Waiting for messages...");

        while (!queue.isEmpty()) {
            DelayedMessage msg = queue.take(); // blocks until delay expires
            System.out.println("Received: " + msg.getMessage() + " at " + System.currentTimeMillis() / 1000);
        }
    }

}

