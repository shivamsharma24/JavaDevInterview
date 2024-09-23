package sapient.serializable.staticFields;

import java.io.Serializable;

public class CustomClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private static String field1;
    private int field2;
    private transient String nonSerializableField;

    // Constructor
    public CustomClass(String field1, int field2, String nonSerializableField) {
        CustomClass.field1 = field1;
        this.field2 = field2;
        this.nonSerializableField = nonSerializableField;
    }

    // Getters and setters
    public static String getField1() {
        return field1;
    }

    public static void setField1(String field1) {
        CustomClass.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public String getNonSerializableField() {
        return nonSerializableField;
    }

    public void setNonSerializableField(String nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    @Override
    public String toString() {
        return "CustomClass{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", nonSerializableField='" + nonSerializableField + '\'' +
                '}';
    }
}
