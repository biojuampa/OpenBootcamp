package mediator;

public class List2ListMain {
    public static void main(String[] args) {
        Mediator mediator = new ArraysMediator();
        Colleague arrayListColleague = new ArrayListColleague();
        Colleague linkedListColleague = new LinkedListColleague();

        mediator.registerColleague(arrayListColleague);
        mediator.registerColleague(linkedListColleague);

        arrayListColleague.addNewWord("ArrayList: uno");
        linkedListColleague.addNewWord("LinkedList: dos");

        System.out.println(arrayListColleague.getAll());
        System.out.println(linkedListColleague.getAll());

//        System.out.println("  ArrayList  |  LinkedList");
//        System.out.println("--------------------------");
//        for (int i = 0; i < array.size(); i++) {
//            System.out.println(" " + array.get(i) + "\t\t" + list.get(i));
//        }

    }
}
