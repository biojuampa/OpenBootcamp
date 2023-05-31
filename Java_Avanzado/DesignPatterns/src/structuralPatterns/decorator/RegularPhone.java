package structuralPatterns.decorator;

public class RegularPhone implements Phone {
    @Override
    public void create() {
        System.out.println("Soy un teléfono regular, y no tengo características adicionales.");
    }
}
