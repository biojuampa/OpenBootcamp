package prototype.cloneable;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.setMarca("Chevrolet");
        miCoche.setModelo("Astra");
        miCoche.setPuertas(4);

        System.out.println("Mi coche " + miCoche);
        System.out.println(miCoche.getMarca() + " " + miCoche.getModelo() + " " + miCoche.getPuertas());
        System.out.println();

        try {
            Coche miClon = miCoche.clonar();
            System.out.println("Mi clon " + miClon);
            miClon.setPuertas(3);
            System.out.println(miClon.getMarca() + " " +miClon.getModelo() + " " + miClon.getPuertas());
        } catch (CloneNotSupportedException e) {
            System.out.println("No se pudo clonar: " + e.getMessage());
        }
    }
}
