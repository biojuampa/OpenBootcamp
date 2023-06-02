package structuralPatterns.adapter;

public class Main {
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        LightbulbAdapter lightbulb = new LightbulbAdapter();

        encender(horno);
        encender(lampara);
        encender(lightbulb);

        apagar(lampara);

        System.out.println();

        System.out.println("Horno encendido: " + estaEncendido(horno));
        System.out.println("Lámpara encendida: " + estaEncendido(lampara));
        System.out.println("Lightbulb encendida: " + estaEncendido(lightbulb));
    }

    private static void encender(Enchufable enchufable) {
        enchufable.enciende();
    }

    private static void apagar(Enchufable enchufable) {
        enchufable.apaga();
    }

    private static boolean estaEncendido(Enchufable enchufable) {
        return enchufable.estaEncendido();
    }
}
