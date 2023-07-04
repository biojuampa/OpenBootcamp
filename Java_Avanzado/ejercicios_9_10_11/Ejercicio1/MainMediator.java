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
        Colleague vectorColleague = new VectorColleague();
        Colleague fileDiskColleague = new FileDiskColleague();

        mediator.registerColleague(arrayListColleague);
        mediator.registerColleague(linkedListColleague);
        mediator.registerColleague(vectorColleague);
        mediator.registerColleague(fileDiskColleague);

        arrayListColleague.addNewWord("ArrayList");
        arrayListColleague.addNewWord("ArrayList");
        linkedListColleague.addNewWord("LinkedList");
        linkedListColleague.addNewWord("LinkedList");
        linkedListColleague.addNewWord("LinkedList");
        vectorColleague.addNewWord("Vector");
        vectorColleague.addNewWord("Vector");
        vectorColleague.addNewWord("Vector");
        vectorColleague.addNewWord("Vector");
        fileDiskColleague.addNewWord("File Disk");
        fileDiskColleague.addNewWord("File Disk");
        fileDiskColleague.addNewWord("File Disk");
        fileDiskColleague.addNewWord("File Disk");
        fileDiskColleague.addNewWord("File Disk");

        System.out.println("ArrayList \t->\t" + arrayListColleague.getAll());
        System.out.println("LinkedList \t->\t" + linkedListColleague.getAll());
        System.out.println("Vector \t\t->\t" + vectorColleague.getAll());
        System.out.println("File Disk \t->\t" + fileDiskColleague.getAll());
    }
}
