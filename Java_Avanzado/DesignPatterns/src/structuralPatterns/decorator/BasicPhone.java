package structuralPatterns.decorator;

public class BasicPhone implements Phone {
    @Override
    public void create() {
        System.out.println("Soy un teléfono básico. Tengo las siguientes características: ");
        gsm();
        sms();
    }

    private void gsm() {
        System.out.println("    -> Tengo GSM");
    }

    private void sms(){
        System.out.println("    -> Tengo SMS");
    }
}
