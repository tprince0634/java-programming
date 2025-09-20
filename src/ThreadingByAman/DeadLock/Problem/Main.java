package ThreadingByAman.DeadLock.Problem;

public class Main {
    static class Resource{
        private String name;

        public Resource(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public static void main(String[] args) {
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + "  Locked " + resource1.getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + "  Trying to Lock " + resource2.getName());
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " Locked " + resource2.getName());
                }

            }

        }, "Thread1");

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + "  Locked " + resource2.getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + "  Trying to Lock " + resource1.getName());
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " Locked " + resource1.getName());
                }

            }

        }, "Thread2");

        thread1.start();
        thread2.start();
    }
}