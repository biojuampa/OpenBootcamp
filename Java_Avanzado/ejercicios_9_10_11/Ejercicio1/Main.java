import mediator.*;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ArraysMediator();
        Colleague arrayListColleague = new ArrayListColleague();
        Colleague linkedListColleague = new LinkedListColleague();

        mediator.registerColleague(arrayListColleague);
        mediator.registerColleague(linkedListColleague);

        arrayListColleague.addNewWord("ArrayList");
        linkedListColleague.addNewWord("LinkedList");

        System.out.println(arrayListColleague.getAll());
        System.out.println(linkedListColleague.getAll());
    }
}
