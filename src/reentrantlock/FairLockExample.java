package reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {
    private int counter = 0;
    private final ReentrantLock lock = new ReentrantLock(true); // Fair lock

    public void increment() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        FairLockExample example = new FairLockExample();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter: " + example.getCounter());
    }
}
