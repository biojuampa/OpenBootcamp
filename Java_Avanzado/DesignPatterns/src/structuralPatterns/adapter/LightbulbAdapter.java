package structuralPatterns.adapter;

public class LightbulbAdapter implements Enchufable {
    private final Lightbulb lightbulb = new Lightbulb();

    @Override
    public void enciende() {
        System.out.println("Adaptando encendido para lightbulb");
        lightbulb.turnOn(220);
    }

    @Override
    public void apaga() {
        System.out.println("Adaptando apagado lightbulb");
        lightbulb.turnOff();
    }

    @Override
    public boolean estaEncendido() {
        return lightbulb.isPoweredOn();
    }
}
