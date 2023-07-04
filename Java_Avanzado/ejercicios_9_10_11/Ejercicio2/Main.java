public class Main {
    public static void main(String[] args) {

        smartWatch();
        smartPhone();

    }

    private static void smartWatch () {
            SmartWatch myWatch = new SmartWatch("Galaxy Watch5", "Samsung", "Pro LTE")
                    .price(259.99f)
                    .weight(46.5f)
                    .screenWidth((short) 450)
                    .screenHeight((short) 450)
                    .shape("cuadrado")
                    .bandMaterial("silicona")
                    .bluetooth(true)
                    .wifi(true)
                    ;

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
    }

    private static void smartPhone() {
        SmartPhone myPhone = new SmartPhone("G3", "LG", "D855")
                .price(325f)
                .discountPercent(5)
                .specialFeatures("Infrarrojo")
                .screenWidth((short) 2560)
                .screenHeight((short) 1440)
                .weight(108f)
                .batteryCapacity((short) 3000)
                .batteryDuration(25890)
                .screenTechnology("Gorila Glass 3")
                .operatingSystem("Android Ice Cream 6.0")
                .nfc(true)
                .dualSim(false)
                .footprintReader(false)
                .cameras((byte) 2)
                .networkTech("GSM, CDMA, 2G, 3G, 4G, LTE")
                .pen(false)
                .fmRadio(true)
                ;

        float price = myPhone.getPrice();
        float discountPercent = myPhone.getDiscountPercent();
        String name = myPhone.getName();
        String brand = myPhone.getBrand();
        String model = myPhone.getModel();
        String specialFeatures = myPhone.getSpecialFeatures();
        short screenWidth = myPhone.getScreenWidth();
        short screenHeight = myPhone.getScreenHeight();
        float weight = myPhone.getWeight();
        short batteryCapacity = myPhone.getBatteryCapacity();
        int batteryDuration = myPhone.getBatteryDuration();
        String screenTechnology = myPhone.getScreenTechnology();
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
                + "\n\t- Tecnología pantalla: " + screenTechnology
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
