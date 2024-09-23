package threads;

public class YieldExample {
    public static void main(String[] args) {
        Thread producer = new Thread(new Producer(), "Producer");
        Thread consumer = new Thread(new Consumer(), "Consumer");

        producer.start();
        consumer.start();
    }
}

class Producer implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " produced: " + i);
            Thread.yield(); // Yielding control to allow other threads to execute
        }
    }
}

class Consumer implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " consumed: " + i);
            Thread.yield(); // Yielding control to allow other threads to execute
        }
    }
}
