package mediator;

import java.util.ArrayList;

public interface Mediator {
    void addNewWord(String word);
    ArrayList<String> listarTodos(Colleague colleague);
}
