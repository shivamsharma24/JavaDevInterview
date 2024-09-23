package creationaldesignnpatterns.singletonpatterns.synchronizedmethod;

public class SingleTonUsingSynchronized {
    private static SingleTonUsingSynchronized instance;

    private SingleTonUsingSynchronized() {
    }
    //locking is very expensive that's why synchronized on method is never used
     synchronized public static SingleTonUsingSynchronized getInstance() {
        if (instance == null) {
            instance = new SingleTonUsingSynchronized();
        }
        return instance;
    }
}
