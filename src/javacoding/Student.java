package javacoding;

import java.util.List;

public class Student {
    private String name;
    private int mathsMarks;
    private List<String> subjects;

    public Student(String name, int mathsMarks) {
        this.name = name;
        this.mathsMarks = mathsMarks;
    }

    public Student(String name, List<String> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public List<String> getSubjects() {
        return subjects;
    }

}
