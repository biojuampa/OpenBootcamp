package structuralPatterns.decorator;

public class NextGenPhone extends PhoneDecorator {
    public NextGenPhone(Phone phone) {
        super(phone);
    }

    @Override
    public void create() {
        super.create();
        System.out.println("  NextGen -> Tengo también 5G");
        System.out.println("  NextGen -> Tengo también VoLTE");
    }
}
