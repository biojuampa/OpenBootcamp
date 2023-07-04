package mediator;

import java.util.ArrayList;

public class ArrayListColleague extends Colleague {
    private final ArrayList<String> words = new ArrayList<>();

    @Override
    protected void insertWord(String word) {
        words.add(word);
    }

    @Override
    public ArrayList<String> getAll() {
        return words;
    }
}
