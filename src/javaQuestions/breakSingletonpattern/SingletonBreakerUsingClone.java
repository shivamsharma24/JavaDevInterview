package javaQuestions.breakSingletonpattern;

public class SingletonBreakerUsingClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton2 instanceOne = Singleton2.getInstance();
        Singleton2 instanceTwo = (Singleton2) instanceOne.clone();

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

class Singleton2 implements Cloneable {
    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
