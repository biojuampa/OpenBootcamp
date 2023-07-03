package iterator;

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
        String word = "";

        try {
            word = words.get(index);
            index++;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: No quedan más elementos.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return word;
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
