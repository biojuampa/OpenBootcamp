package behavioralPatterns.iterator;

import java.util.ArrayList;

public class Users implements UserIterator {
    private int index = 0;
    private final ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User next() {
//        User user = users.get(index);
//        index++;
//        return user;

        index++;
        return users.get(index-1);

    }

    @Override
    public void reset() {
        index = 0;
    }

    @Override
    public boolean hasMore() {
        return index < users.size();
    }
}
