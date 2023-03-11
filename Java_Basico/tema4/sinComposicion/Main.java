public class Main {
    public static void main(String[] args) {

        SmartWatch myWatch = new SmartWatch();

        myWatch.setName("Galaxy Watch5");
        myWatch.setModel("Pro LTE");
        myWatch.setPrice(259.99f);
        myWatch.setBrand("Samsung");
        myWatch.setWeight(46.5f);
        myWatch.setScreenWidth((short)450);
        myWatch.setScreenHeight((short)450);
        myWatch.setShape("cuadrado");
        myWatch.setBandMaterial("silicona");
        myWatch.setBluetooth(true);
        myWatch.setWifi(true);

        String name = myWatch.getName();
        String model = myWatch.getModel();
        float price = myWatch.getPrice();
        String brand = myWatch.getBrand();
        float weight = myWatch.getWeight();
        short width = myWatch.getScreenWidth();
        short height = myWatch.getScreenHeight();
        String shape = myWatch.getShape();
        String band = myWatch.getBandMaterial();
        boolean bt = myWatch.getBluetooth();
        boolean wifi = myWatch.getWifi();

        System.out.println("SmartWatch: " + myWatch
                         + "\n"
                         + "\n\t- Precio: U$S" + price
                         + "\n\t- Peso: " + weight + " grs"
                         + "\n\t- Ancho pantalla: " + width + " px"
                         + "\n\t- Alto pantalla: " + height + " px"
                         + "\n\t- Forma: " + shape
                         + "\n\t- Malla: " + band
                         + "\n\t- Con bluetooth: " + bt
                         + "\n\t- Con wifi: " + wifi
                         + "\n"
                           );
    
    ///////////////////////////////////////////////////////////////////////

        SmartPhone myPhone = new SmartPhone(325f,
                                            5f,
                                            "G3",
                                            "LG",
                                            "D855",
                                            "Infrarrojo",
                                            (short)2560,
                                            (short)1440,
                                            108f,
                                            (short)3000,
                                            25890,
                                            "Gorila Glass 3",
                                            "Android Ice Cream 6.0",
                                            true,
                                            false,
                                            false,
                                            (byte)2,
                                            "GSM, CDMA, 2G, 3G, 4G, LTE",
                                            false,
                                            true
                                            );
        
//        myPhone.setNfc(true);
//        myPhone.setSpecialFeatures("I.R.");

        price = myPhone.getPrice(); 
        float discountPercent = myPhone.getDiscountPercent();
        name = myPhone.getName();
        brand = myPhone.getBrand();
        model = myPhone.getModel();
        String specialFeatures = myPhone.getSpecialFeatures();
        short screenWidth = myPhone.getScreenWidth();
        short screenHeight = myPhone.getScreenHeight();
        weight = myPhone.getWeight();
        short batteryCapacity = myPhone.getBatteryCapacity();
        int batteryDuration = myPhone.getBatteryDuration();
        String screenTecnology = myPhone.getScreenTecnology();
        String operatingSystem = myPhone.getOperatingSystem();
        boolean nfc = myPhone.getNfc();
        boolean dualSim = myPhone.getDualSim();
        boolean footprintReader = myPhone.getFootprintReader();
        byte cameras = myPhone.getCameras();
        String networkTech = myPhone.getNetworkTech();
        boolean pen = myPhone.getPen();
        boolean fmRadio = myPhone.getFmRadio();

        System.out.println("SmartPhone: " + myPhone
                         + "\n"
                         + "\n\t- Precio: U$D" + price
                         + "\n\t- Descuento: " + discountPercent + " %"
                         + "\n\t- Precio con el descuento: U$D" + myPhone.getPriceWithDiscount()
                         + "\n\t- Características especiales: " + specialFeatures
                         + "\n\t- Ancho pantalla: " + screenWidth + " px"
                         + "\n\t- Alto pantalla: " + screenHeight + " px"
                         + "\n\t- Peso: " + weight + " grs"
                         + "\n\t- Capacidad batería: " + batteryCapacity + " mah"
                         + "\n\t- Duración batería: " + batteryDuration/3600 + " horas " + (batteryDuration%3600)/60 + " minutos"
                         + "\n\t- Tecnología pantalla: " + screenTecnology
                         + "\n\t- Sistema operativo: " + operatingSystem
                         + "\n\t- Con NFC: " + nfc 
                         + "\n\t- Con dual sim: " + dualSim 
                         + "\n\t- Lector de huella: " + footprintReader
                         + "\n\t- Cantidad de cámaras: " + cameras
                         + "\n\t- Tecnología de red: " + networkTech
                         + "\n\t- Lápiz táctil: " + pen
                         + "\n\t- Radio FM: " + fmRadio
                         + "\n"
                           );

    }
}
