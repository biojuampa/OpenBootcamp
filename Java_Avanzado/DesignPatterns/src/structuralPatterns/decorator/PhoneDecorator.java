package structuralPatterns.decorator;

// Yo considero que esta clase conectora intermedia
// debería ser abstracta. Pero Víctor no lo hace así.
abstract public class PhoneDecorator implements Phone {
    private Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void create() {
        phone.create();
    }
}
