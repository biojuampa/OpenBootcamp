package Builder;

public class Main {
    public static void main(String[] args) {
//        Coche coche = new Coche("Ford");

//        coche.setMotor("Nafta");
//        coche.setModelo("Focus");
//        coche.setPotencia(170);
//        coche.setPuertas(5);

        Coche coche = new CocheBuilder("Ford")
                .setMotor("Nafta")
                .setModelo("Focus")
                .setPotencia(170)
                .setPuertas(5)
                .build()
                ;

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Combustible: " + coche.getMotor());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Potencia: " + coche.getPotencia() + " c.v.");
        System.out.println("Puertas: " + coche.getPuertas());
    }
}
