package behavioraldesignpatterns.mementopattern;

import behavioraldesignpatterns.mementopattern.caretaker.TextEditorCaretaker;
import behavioraldesignpatterns.mementopattern.originator.TextEditor;

public class Test {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        // Set initial text
        editor.setText("Hello, world!");
        System.out.println("Initial text: " + editor.getText());

        // Save the current state
        caretaker.saveState(editor);

        // Modify the text
        editor.setText("Goodbye, world!");
        System.out.println("Modified text: " + editor.getText());

        // Restore the previous state
        caretaker.restoreState(editor);
        System.out.println("Restored text: " + editor.getText());
    }
}
