package Threading.Advance.DeadLock;

public class SimpleDeadlock2 {

    static class Resource {
        private final String name;

        public Resource(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Resource resource1 = new Resource("resource1");
        Resource resource2 = new Resource("resource2");


        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource1.getName());
                try {
                    Thread.sleep(1500); // Simulate some work with resource1
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + " trying to lock " + resource2.getName());
                synchronized (resource2) { // Corrected to lock resource2
                    System.out.println(Thread.currentThread().getName() + " locked " + resource2.getName());
                }
            }
        }, "Thread1");

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource2.getName());
                try {
                    Thread.sleep(1500); // Simulate some work with resource2
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + " trying to lock " + resource1.getName());
                synchronized (resource1) { // Corrected to lock resource1
                    System.out.println(Thread.currentThread().getName() + " locked " + resource1.getName());
                }
            }
        }, "Thread2");

        thread1.start();
        thread2.start();
    }
}