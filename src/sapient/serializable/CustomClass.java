package sapient.serializable;

import java.io.Serializable;

public class CustomClass implements Serializable {
    // Step 3: Provide a serialVersionUID
    private static final long serialVersionUID = 1L;
    
    private String field1;
    private int field2;
    private transient String nonSerializableField;

    // Constructor
    public CustomClass(String field1, int field2, String nonSerializableField) {
        this.field1 = field1;
        this.field2 = field2;
        this.nonSerializableField = nonSerializableField;
    }

    // Getters and setters
    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
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
