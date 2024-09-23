package shivam.serializationofSingletonPattern;

import java.io.*;

public class SingletonSerializationDemo {

    public static void main(String[] args) {
        try {
            Singleton instance1 = Singleton.getInstance();

            // Serialize the singleton instance
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(instance1);
            out.close();

            // Deserialize the singleton instance
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            Singleton instance2 = (Singleton) in.readObject();
            in.close();

            // Check if both instances are the same
            System.out.println("instance1 hashCode: " + instance1.hashCode());
            System.out.println("instance2 hashCode: " + instance2.hashCode());
            System.out.println("Are both instances the same? " + (instance1 == instance2));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
