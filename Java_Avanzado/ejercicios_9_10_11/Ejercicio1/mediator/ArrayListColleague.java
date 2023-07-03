package mediator;

import java.util.ArrayList;

public class ArrayListColleague extends Colleague {
    private final ArrayList<String> words = new ArrayList<>();

//    @Override
//    void setMediator(Mediator mediator) {
//        System.out.println("hola desde ArrayListColleague");;
//    }

    @Override
    public void addNewWord(String word) {
        includeNewWord(word);
        mediator.sendNewWord(this, word);
    }

    @Override
    protected void includeNewWord(String word) {
        words.add(word);
    }

    @Override
    public ArrayList<String> getAll() {
        return words;
    }
}
