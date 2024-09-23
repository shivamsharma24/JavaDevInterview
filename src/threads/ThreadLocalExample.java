package threads;

public class ThreadLocalExample {
    // Create a ThreadLocal variable
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);

    public static void main(String[] args) {
        Runnable task = () -> {
            // Each thread gets its own copy of the ThreadLocal variable
            int value = threadLocal.get();
            System.out.println(Thread.currentThread().getName() + " initial value: " + value);
            
            // Modify the ThreadLocal variable
            threadLocal.set(value * 2);
            System.out.println(Thread.currentThread().getName() + " modified value: " + threadLocal.get());
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        
        thread1.start();
        thread2.start();
    }
}
