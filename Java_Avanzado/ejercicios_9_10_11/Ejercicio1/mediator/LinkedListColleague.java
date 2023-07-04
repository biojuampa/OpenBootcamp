package mediator;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListColleague extends Colleague {
    private final LinkedList<String> words = new LinkedList<>();

//    @Override
//    public void addNewWord(String word) {
//        words.add(word);
//        mediator.sendNewWord(this, word);
//    }

    @Override
    public ArrayList<String> getAll() {
        return new ArrayList<>(words);
    }

    @Override
    protected void insertWord(String word) {
        words.add(word);
    }
}
