import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();

        emisor.meteReceptor(new Receptor());
        emisor.meteReceptor(new Receptor());
        emisor.meteReceptor(new Receptor());

        emisor.saluda();
    }
}

interface Mensajero {
    void hanSaludado();
}

class Emisor {
    private final ArrayList<Mensajero> receptores = new ArrayList<>();

    public void meteReceptor(Mensajero receptor) {
        receptores.add(receptor);
    }

    public void saluda() {
        System.out.println("¡Hola desde Emisor!");

        for (Mensajero receptor : receptores) {
            receptor.hanSaludado();
        }
    }
}

class Receptor implements Mensajero {
    @Override
    public void hanSaludado() {
        System.out.println("Hola en clase receptor " + this);
    }
}
