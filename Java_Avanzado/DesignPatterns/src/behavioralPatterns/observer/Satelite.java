package behavioralPatterns.observer;

public class Satelite implements Receptor {
    @Override
    public void escucha() {
        System.out.println("Satélite ha hablado.");
    }
}
