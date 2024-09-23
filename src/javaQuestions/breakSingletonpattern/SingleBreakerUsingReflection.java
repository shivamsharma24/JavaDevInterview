package javaQuestions.breakSingletonpattern;

import java.lang.reflect.Constructor;

public class SingleBreakerUsingReflection {
    public static void main(String[] args) {
        Singleton instTwo = null;
        Singleton instOne = Singleton.getInstance();
        //By using Reflection API
        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
             instTwo  =constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instOne.hashCode());
        System.out.println(instTwo.hashCode());

    }
}

 class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
