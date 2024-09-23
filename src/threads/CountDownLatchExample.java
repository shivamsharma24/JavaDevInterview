package threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        final int numTasks = 3;
        CountDownLatch latch = new CountDownLatch(numTasks);

        for (int i = 0; i < numTasks; i++) {
            new Thread(new Task1(latch)).start();
        }

        try {
            // The main thread will wait until all tasks are completed
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks are completed. Main thread proceeding.");
    }
}

class Task1 implements Runnable {
    private final CountDownLatch latch;

    public Task1(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // Simulate task processing
            System.out.println(Thread.currentThread().getName() + " is performing the task.");
            Thread.sleep(1000); // Simulating work
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Decrement the count of the latch
            latch.countDown();
            System.out.println(Thread.currentThread().getName() + " has finished.");
        }
    }
}
