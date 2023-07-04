package mediator;

import java.util.ArrayList;
import java.util.Vector;

public class VectorColleague extends Colleague {
    private final Vector<String> words = new Vector<>();

    @Override
    protected void insertWord(String word) {
        words.add(word);
    }

    @Override
    public ArrayList<String> getAll() {
        return new ArrayList<>(words);
    }
}
