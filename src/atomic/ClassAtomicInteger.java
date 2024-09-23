package atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ClassAtomicInteger {
    private AtomicInteger i= new AtomicInteger();

    public int getI() {
        return i.get();
    }

    public void incrementI(){
        i.incrementAndGet();
    }

    public static void main(String[] args) {
        ClassAtomicInteger classAtomicInteger= new ClassAtomicInteger();

        ExecutorService executorService= Executors.newFixedThreadPool(10);

        for(int j=0;j<10;j++){
            executorService.submit(()->{
                for (int k=0;k<1000;k++){
                    classAtomicInteger.incrementI();
                }
            });
        }
        executorService.shutdownNow();
        try {
            if (!executorService.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        System.out.println("Final count is "+classAtomicInteger.getI());

    }
}
