package behavioralPatterns.observer;

public class Television implements Receptor {
    @Override
    public void escucha() {
        System.out.println("Televisión ha escuchado.");
    }
}
