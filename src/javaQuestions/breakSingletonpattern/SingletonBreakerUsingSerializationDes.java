package javaQuestions.breakSingletonpattern;

import java.io.*;

public class SingletonBreakerUsingSerializationDes {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton1 instanceOne = Singleton1.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        oos.writeObject(instanceOne);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton1 instanceTwo = (Singleton1) ois.readObject();
        ois.close();

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

class Singleton1 implements Serializable {
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
