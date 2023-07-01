import java.util.ArrayList;

public class StringsMemory implements StringsIterator {
    private int index = 0;
    private ArrayList<String> words = new ArrayList<>();

    @Override
    public void addNewWord(String word) {
        words.add(word);
    }

    @Override
    public String next() {
        if (index >= words.size())
            return null;

        index++;
        return words.get(index-1);
    }

    @Override
    public boolean hasMore() {
        return words.size() > index;
    }

    @Override
    public void reset() {
        index = 0;
    }
}
