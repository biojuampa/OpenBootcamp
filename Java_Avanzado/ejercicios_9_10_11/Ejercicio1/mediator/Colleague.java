package mediator;

import java.util.ArrayList;

public abstract class Colleague {
    private Mediator mediator;

    protected void setMediator(Mediator mediator) {
        this.mediator = mediator;
    };

    public void addNewWord(String word) {
        includeNewWord(word);
        mediator.sendNewWord(this, word);
    }

    abstract protected void includeNewWord(String word);
    abstract public ArrayList<String> getAll();
}
