package mediator;

import java.util.ArrayList;

public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    };

    abstract public void addNewWord(String word);
    abstract protected void includeNewWord(String word);
    abstract public ArrayList<String> getAll();
}
