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
    
    ///////////////////////////////////////////////////////
        
//        short width = 320;
//        short height = 240;
//        short capacity = 1800;
//        SmartWatch watch = new SmartWatch(width, height, 75.8f, capacity, 10200987,
//                                          "OLED", "Android 12.1", 250.49f,
//                                          "Samsung", "S5", "Square",
//                                          "Bluetooth LTE", "Silicon"
//                                          );
//        
//        System.out.println(watch);

    }
}

