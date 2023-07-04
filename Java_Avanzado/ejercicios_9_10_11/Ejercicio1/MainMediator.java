import mediator.*;

/*
   La clase Main debería estar fuera del paquete mediator e importarlo
   para que así funcione correctamente la encapsulación.
*/

public class MainMediator {
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
