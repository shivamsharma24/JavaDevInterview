package mock.q1;

import java.util.HashMap;
import java.util.Map;

/*
write a java code in which we have array of employees
objects along with fields like id,name,depId,codeCommitCount.
I wanted to find employee for each department having highest codeCommitcount?
*/
public class Main {
    public static void main(String[] args) {
        
        Employee[] employees = new Employee[]{
                new Employee(1, "Alice", 101, 120),
                new Employee(2, "Bob", 102, 150),
                new Employee(3, "Charlie", 101, 200),
                new Employee(4, "David", 103, 170),
                new Employee(5, "Eve", 102, 180),
                new Employee(6, "Frank", 103, 160),
        };

        HashMap<Integer, Employee> map = new HashMap<>();

        for (Employee e : employees) {
            if (!map.containsKey(e.depId) || e.codeCommitCount > map.get(e.depId).codeCommitCount) {
                map.put(e.depId, e);
            }
        }
        //Iterating Again
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            System.out.println("Departent Id :: is " + entry.getKey() + " top employee is " + entry.getValue());
        }
    }
}
