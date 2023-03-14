import java.util.ArrayList;
import java.util.LinkedList;


public class ArrayList2LinkedList {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();

        array.add("Uno");
        array.add("Dos");
        array.add("Tres");
        array.add("Cuatro");

        LinkedList<String> list = new LinkedList<>(array);

        System.out.println("  ArrayList  |  LinkedList");
        System.out.println("--------------------------");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(" " + array.get(i) + "\t\t" + list.get(i));
        }

    }
}

