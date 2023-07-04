package mediator;

import java.util.ArrayList;

public abstract class Colleague {
    private Mediator mediator;

    protected final void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public final void addNewWord(String word) {
        insertWord(word);
        mediator.sendNewWord(this, word);
    }

    protected abstract void insertWord(String word);
    public abstract ArrayList<String> getAll();
}
