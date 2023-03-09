public class Main {
    public static void main(String[] args) {

        SmartWatch myWatch = new SmartWatch();

        myWatch.setPrice(12.5f);
        myWatch.setBrand("Samsung");
        myWatch.setWeight(77.8f);

        System.out.println("Hasta ahora, sin problemas.");

        float price = myWatch.getPrice();
        String brand = myWatch.getBrand();
        float weight = myWatch.getWeight();

        System.out.println("El reloj " + brand +
                           " cuesta U$S" + price +
                           " y pesa " + weight + " grs."
                           );
    
    }
}

