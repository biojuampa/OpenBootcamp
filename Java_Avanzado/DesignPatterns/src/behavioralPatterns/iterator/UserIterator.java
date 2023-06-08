package behavioralPatterns.iterator;

public interface UserIterator {
    User next();
    void reset();
    boolean hasMore();
}
