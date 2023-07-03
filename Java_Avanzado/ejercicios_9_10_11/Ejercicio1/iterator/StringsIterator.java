package iterator;

public interface StringsIterator {
    void addNewWord(String word);
    String next();
    boolean hasMore();
    void reset();
}
