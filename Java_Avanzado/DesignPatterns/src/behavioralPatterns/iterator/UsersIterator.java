package behavioralPatterns.iterator;

public interface UsersIterator {
    User next();
    void reset();
    boolean hasMore();
}
