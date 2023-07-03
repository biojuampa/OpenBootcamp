package mediator;

public interface Mediator {
    void registerColleague(Colleague colleague);
    void sendNewWord(Colleague colleague, String word);
}
