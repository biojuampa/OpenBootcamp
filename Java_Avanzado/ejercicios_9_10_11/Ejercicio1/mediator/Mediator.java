package mediator;

public abstract class Mediator {
    public abstract void registerColleague(Colleague colleague);
    protected abstract void sendNewWord(Colleague colleague, String word);
}
