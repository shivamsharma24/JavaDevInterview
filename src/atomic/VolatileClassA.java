package atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileClassA {
    private volatile int  i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void incrementI(){
        i++;
    }

    //This will produce different results on every run bcz i++ is not atomic operations
    public static void main(String[] args) {
        VolatileClassA volatileClassA= new VolatileClassA();
        volatileClassA.setI(0);

        ExecutorService executorService= Executors.newFixedThreadPool(10);

        for (int j=0;j<10;j++){
            executorService.submit(()->{
                for (int k=0;k<1000;k++){
                    synchronized (volatileClassA){
                        volatileClassA.incrementI();
                    }
                }
            });
        }
        executorService.shutdown();
        System.out.println("Final count is "+volatileClassA.getI());

    }
}
