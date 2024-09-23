package javaQuestions.blankfinalvariable;

public class Example {
    private final int blankFinalVariable;

    // Constructor
    public Example(int value) {
        // Initializing the blank final variable
        this.blankFinalVariable = value;
    }

    public int getBlankFinalVariable() {
        return blankFinalVariable;
    }

    public static void main(String[] args) {
        Example example = new Example(10);
        System.out.println(example.getBlankFinalVariable());
    }
}
