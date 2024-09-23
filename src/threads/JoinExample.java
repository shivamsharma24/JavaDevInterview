package threads;

public class JoinExample {
    public static void main(String[] args) {
        Thread t1= new Thread(()->{
            for (int i=1;i<=5;i++){
                System.out.println("T1 count is "+i);

                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });


        Thread t2= new Thread(()->{
            for (int i=1;i<=5;i++){
                System.out.println("T2 count is "+i);
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        try{
            //Main thread will wait until t1 execution completed
            t1.join();
            //Main thread will wait until t2 execution completed
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // This will only print after T1 and T2 have finished
        System.out.println("Both threads T1 and T2 have finished execution.");

    }
}
