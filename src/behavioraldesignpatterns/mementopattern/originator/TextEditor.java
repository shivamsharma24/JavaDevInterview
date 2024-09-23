package behavioraldesignpatterns.mementopattern.originator;

import behavioraldesignpatterns.mementopattern.memento.Memento;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento createMemento() {
        return new Memento(text);
    }

    public void restoreMemento(Memento memento) {
        this.text = memento.getText();
    }
}