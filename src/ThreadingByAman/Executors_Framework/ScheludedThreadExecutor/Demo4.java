package ThreadingByAman.Executors_Framework.ScheludedThreadExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo4 {
    public static void main(String[] args) {
        // Fixed Delay
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);
        scheduled.scheduleWithFixedDelay(() -> {
            System.out.println("AAA");
        }, 2, 5, TimeUnit.SECONDS); // Initial delay: 2s, then 5s after previous task finishes
    }
}


/*🔹 Parameters
initialDelay: Time to wait before first task runs
delay: Time to wait after each task finishes, before starting the next
timeUnit: Time unit (seconds, milliseconds, etc.)
*/

/*🔍 Difference Between scheduleAtFixedRate and scheduleWithFixedDelay
Feature	scheduleAtFixedRate
scheduleWithFixedDelay

Timing logic	     Starts next task at a fixed rate, based on initial start time
                     Starts next task after a fixed delay, based on task end time
Overlaps possible?	Yes (if task takes longer than interval)
                    No (waits for task to finish before next starts)

*/