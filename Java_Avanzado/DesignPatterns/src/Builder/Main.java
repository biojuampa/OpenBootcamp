package Builder;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new CocheBuilder("Ford")
                .setMotor("Nafta")
                .setModelo("Focus")
                .setPotencia(170)
                .setPuertas(5)
                .build()
                ;

        System.out.println(coche1.getMarca());
        System.out.println(coche1.getMotor());
        System.out.println(coche1.getMarca());
        System.out.println(coche1.getPotencia());
        System.out.println(coche1.getPuertas());

//        Coche coche = new Coche("Ford");
//
//        coche.setMotor("Nafta");
//        coche.setModelo("Focus");
//        coche.setPotencia(170);
//        coche.setPuertas(5);
//
//        System.out.println("Marca: " + coche.getMarca());
//        System.out.println("Combustible: " + coche.getMotor());
//        System.out.println("Modelo: " + coche.getModelo());
//        System.out.println("Potencia: " + coche.getPotencia() + " c.v.");
//        System.out.println(coche.getPuertas() + " puertas");
    }
}
