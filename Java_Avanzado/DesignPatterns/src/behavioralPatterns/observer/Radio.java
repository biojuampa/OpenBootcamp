package behavioralPatterns.observer;

public class Radio implements Receptor {
    @Override
    public void escucha() {
        System.out.println("Radio ha escuchado.");
    }
}
