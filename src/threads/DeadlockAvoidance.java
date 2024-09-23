package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class DeadlockAvoidance {
    public static void main(String[] args) {
        final Lock lock1 = new ReentrantLock();
        final Lock lock2 = new ReentrantLock();

        // Thread 1
        Thread thread1 = new Thread(() -> {
            try {
                while (true) {
                    // Try to lock resource 1
                    if (lock1.tryLock(50, TimeUnit.MILLISECONDS)) {
                        try {
                            System.out.println("Thread 1: Locked resource 1");

                            // Try to lock resource 2
                            if (lock2.tryLock(50, TimeUnit.MILLISECONDS)) {
                                try {
                                    System.out.println("Thread 1: Locked resource 2");
                                    // Critical section
                                    break; // Exit the loop if both locks are acquired
                                } finally {
                                    lock2.unlock();
                                }
                            } else {
                                System.out.println("Thread 1: Failed to lock resource 2, retrying...");
                            }
                        } finally {
                            lock1.unlock();
                        }
                    } else {
                        System.out.println("Thread 1: Failed to lock resource 1, retrying...");
                    }
                    // Sleep before retrying
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            try {
                while (true) {
                    // Try to lock resource 2
                    if (lock2.tryLock(50, TimeUnit.MILLISECONDS)) {
                        try {
                            System.out.println("Thread 2: Locked resource 2");

                            // Try to lock resource 1
                            if (lock1.tryLock(50, TimeUnit.MILLISECONDS)) {
                                try {
                                    System.out.println("Thread 2: Locked resource 1");
                                    // Critical section
                                    break; // Exit the loop if both locks are acquired
                                } finally {
                                    lock1.unlock();
                                }
                            } else {
                                System.out.println("Thread 2: Failed to lock resource 1, retrying...");
                            }
                        } finally {
                            lock2.unlock();
                        }
                    } else {
                        System.out.println("Thread 2: Failed to lock resource 2, retrying...");
                    }
                    // Sleep before retrying
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
