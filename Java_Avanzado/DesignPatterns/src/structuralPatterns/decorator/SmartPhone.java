package structuralPatterns.decorator;

public class SmartPhone extends PhoneDecorator {
    public SmartPhone(Phone phone) {
        super(phone);
    }

    @Override
    public void create() {
        super.create();
        System.out.println("  SmartPhone -> Tengo también 4G");
    }
}
