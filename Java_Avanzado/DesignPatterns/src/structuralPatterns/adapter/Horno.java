package structuralPatterns.adapter;

public class Horno implements Enchufable {
    private boolean encendido = false;

    @Override
    public void enciende() {
        System.out.println("Encendiendo horno");
        encendido = true;
    }

    @Override
    public void apaga() {
        System.out.println("Apagando horno");
        encendido = false;
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
