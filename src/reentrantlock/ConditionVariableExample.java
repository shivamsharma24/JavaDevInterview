package reentrantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionVariableExample {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean ready = false;

    public void awaitSignal() {
        lock.lock();
        try {
            while (!ready) {
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + " received signal");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void sendSignal() {
        lock.lock();
        try {
            ready = true;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ConditionVariableExample example = new ConditionVariableExample();

        Thread waitingThread = new Thread(example::awaitSignal);
        waitingThread.start();

        Thread.sleep(1000);

        Thread signalingThread = new Thread(example::sendSignal);
        signalingThread.start();

        waitingThread.join();
        signalingThread.join();
    }
}
