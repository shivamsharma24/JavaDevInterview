package threadllocal;

public class ThreadLocalExample {
    // Creating a ThreadLocal variable with an initial value of 0
    private static ThreadLocal<Integer> threadLocalCounter = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        // Creating multiple threads that access the same ThreadLocal variable
        Runnable task = () -> {
            // Each thread increments its own ThreadLocal variable
            int currentValue = threadLocalCounter.get();
            threadLocalCounter.set(currentValue + 1);
            System.out.println(Thread.currentThread().getName() + ": " + threadLocalCounter.get());
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
