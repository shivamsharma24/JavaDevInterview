package runnbale_callable;

import java.util.concurrent.*;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() {
        System.out.println("Callable Task executed");
        return 2*5;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> callable = new MyCallable();
        Future<Integer> future = executor.submit(callable);

        try {
            Integer result = future.get();
            System.out.println("Result is "+result);
        }catch (InterruptedException| ExecutionException e) {
            e.printStackTrace();
        }finally {
            executor.shutdown();
        }
    }
}
