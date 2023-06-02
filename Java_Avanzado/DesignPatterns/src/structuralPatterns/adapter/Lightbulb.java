package structuralPatterns.adapter;

public class Lightbulb {
    private boolean isPowered = false;

    public void turnOn(int voltage) {
        System.out.println("Turning ON with " + voltage + " Vca");
        isPowered = true;
    }

    public void turnOff() {
        System.out.println("Turning OFF");
        isPowered = false;
    }

    public boolean isPoweredOn() {
        return isPowered;
    }
}
