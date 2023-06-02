package structuralPatterns.adapter;

public class Lampara implements Enchufable {
    private boolean encendido = false;

    @Override
    public void enciende() {
        System.out.println("Encendiendo lámpara");
        encendido = true;
    }

    @Override
    public void apaga() {
        System.out.println("Apagando lámpara");
        encendido = false;
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
