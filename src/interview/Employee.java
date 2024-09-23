package interview;

import java.util.HashMap;
import java.util.Objects;

//No equals method overriding i.e equals() method of object class
//will be used
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(10, "abc");
        Employee e2 = new Employee(10, "abc");
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        HashMap<Employee, String> map = new HashMap<>();
        map.put(e1, "First Entry");
        map.put(e2, "Second Entry");

        System.out.println("Size of the map: " + map.size());
    }
}
