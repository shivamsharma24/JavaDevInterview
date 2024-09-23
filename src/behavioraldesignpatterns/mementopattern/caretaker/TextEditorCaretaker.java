package behavioraldesignpatterns.mementopattern.caretaker;

import behavioraldesignpatterns.mementopattern.memento.Memento;
import behavioraldesignpatterns.mementopattern.originator.TextEditor;

public class TextEditorCaretaker {
    private Memento memento;

    public void saveState(TextEditor editor) {
        this.memento = editor.createMemento();
    }

    public void restoreState(TextEditor editor) {
        editor.restoreMemento(this.memento);
    }
}