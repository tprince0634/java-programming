//package Threading.Advance.ThreadCommunication;
//
//public class Sample {
//    private int data;
//    private boolean hasData;
//
//    public synchronized void producer(int data){
//        while(hasData){
//            try{
//                wait();
//            }catch (InterruptedException e){
//                Thread.currentThread().interrupt();
//            }
//        }
//        this.data = data;
//        hasData = true;
//        notify();   // Notify consumer
//    }
//
//    public synchronized int consumer() {
//        while (!hasData) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
//        hasData = false;
//        notify(); // Notify producer
//        return data;
//    }
//
//    class Producer extends Thread {
//        private Sample sample;
//
//        public Producer(Sample sample) {
//            this.sample = sample;
//        }
//
//        @Override
//        public void run() {
//            for (int i = 0; i < 10; i++) {
//                sample.producer(i);
//                System.out.println("Produced " + i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
//            }
//        }
//    }
//
//    class Consumer extends Thread {
//        private Sample sample;
//
//        public Consumer(Sample sample) {
//            this.sample = sample;
//        }
//
//        @Override
//        public void run() {
//            for (int i = 0; i < 10; i++) {
//                int consumed = sample.consumer();
//                System.out.println("Consumed " + consumed);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Sample sample = new Sample();
//
//        Producer producer = sample.new Producer(sample);
//        Consumer consumer = sample.new Consumer(sample);
//
//        producer.start();
//        consumer.start();
//    }
//}
