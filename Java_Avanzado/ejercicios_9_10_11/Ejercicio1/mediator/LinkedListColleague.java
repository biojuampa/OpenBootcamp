package mediator;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListColleague extends Colleague {
    private final LinkedList<String> words = new LinkedList<>();

    @Override
    protected void insertWord(String word) {
        words.add(word);
    }

    @Override
    public ArrayList<String> getAll() {
        return new ArrayList<>(words);
    }
}
