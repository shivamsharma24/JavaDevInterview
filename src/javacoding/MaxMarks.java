package javacoding;

import java.util.Arrays;
import java.util.List;

public class MaxMarks {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 90),
                new Student("Charlie", 78),
                new Student("David", 92));

        int maxMarks = students.stream()
                .mapToInt(Student::getMathsMarks)
                .max()
                .orElse(0);
        System.out.println("Max marks is :: "+maxMarks);
    }
}
