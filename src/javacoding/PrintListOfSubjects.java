package javacoding;

import java.util.Arrays;
import java.util.List;

public class PrintListOfSubjects {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", Arrays.asList("Math", "Science", "English")),
                new Student("Bob", Arrays.asList("History", "Math", "Biology")),
                new Student("Charlie", Arrays.asList("English", "Art", "Music"))
        );

        students.forEach(
                s->{
                    System.out.println("subjects for "+s.getName()+"  "+s.getSubjects());
                }
        );
    }
}
