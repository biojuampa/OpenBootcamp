package behavioralPatterns.observer;

import java.util.ArrayList;

public class Emisor {
    private ArrayList<Receptor> receptores = new ArrayList<>();

    public void agregaReceptor(Receptor receptor) {
        receptores.add(receptor);
    }

    public void habla() {
        System.out.println("Emisor ha hablado.");
        for (Receptor receptor: receptores)
            receptor.escucha();
    }
}
