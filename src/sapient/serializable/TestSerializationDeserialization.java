package sapient.serializable;

import java.io.*;

public class TestSerializationDeserialization {
    public static void main(String[] args) {
        CustomClass originalObject = new CustomClass("example", 123, "transientData");

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customClass.ser"))) {
            oos.writeObject(originalObject);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        CustomClass deserializedObject = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customClass.ser"))) {
            deserializedObject = (CustomClass) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Print the deserialized object
        System.out.println("Original Object: " + originalObject);
        System.out.println("Deserialized Object: " + deserializedObject);
    }
}
