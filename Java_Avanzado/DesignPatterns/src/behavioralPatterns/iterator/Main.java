package behavioralPatterns.iterator;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();

        users.addUser(new User("Usuario 1", 12));
        users.addUser(new User("Usuario 2", 21));
        users.addUser(new User("Usuario 3", 44));

        while (users.hasMore()) {
            System.out.println(users.next().getName());
        }

        users.addUser(new User("Usuario 4", 33));
        users.addUser(new User("Usuario 5", 66));

        System.out.println();
        users.reset();
        while (users.hasMore()) {
            System.out.println(users.next().getName());
        }

    }
}
