package creationalPatterns.prototype.raw;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.setMarca("Chevrolet");
        miCoche.setModelo("Astra");
        miCoche.setPuertas(4);

        Coche miClon = miCoche.clonar();

        System.out.println("Mi coche " + miCoche);
        System.out.println(miCoche.getMarca() + " " + miCoche.getModelo() + " " + miCoche.getPuertas());
        System.out.println();
        System.out.println("Mi clon " + miClon);
        System.out.println(miClon.getMarca() + " " +miClon.getModelo() + " " + miClon.getPuertas());
    }
}
