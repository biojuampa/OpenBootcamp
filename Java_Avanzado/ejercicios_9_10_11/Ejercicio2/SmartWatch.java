public class SmartWatch extends SmartDevice {

    // Atributos
    private String shape;
    private String bandMaterial;
    private boolean bluetooth;
    private boolean wifi;

    // Constructores
    public SmartWatch(String name, String brand, String model) {
        super(name, brand, model);
    }

    // Métodos
    // Patrón builder
    @Override
    public SmartWatch price(float price) {
        super.price(price);
        return this;
    }

    @Override
    public SmartWatch discountPercent(float discountPercent) {
        super.discountPercent(discountPercent);
        return this;
    }

    @Override
    public SmartWatch specialFeatures(String specialFeatures) {
        super.specialFeatures(specialFeatures);
        return this;
    }

    @Override
    public SmartWatch screenWidth(short screenWidth) {
        super.screenWidth(screenWidth);
        return this;
    }

    @Override
    public SmartWatch screenHeight(short screenHeight) {
        super.screenHeight(screenHeight);
        return this;
    }

    @Override
    public SmartWatch weight(float weight) {
        super.weight(weight);
        return this;
    }

    @Override
    public SmartWatch batteryCapacity(short batteryCapacity) {
        super.batteryCapacity(batteryCapacity);
        return this;
    }

    @Override
    public SmartWatch batteryDuration(int batteryDuration) {
        super.batteryDuration(batteryDuration);
        return this;
    }

    @Override
    public SmartWatch screenTechnology(String screenTechnology) {
        super.screenTechnology(screenTechnology);
        return this;
    }

    @Override
    public SmartWatch operatingSystem(String operatingSystem) {
        super.operatingSystem(operatingSystem);
        return this;
    }

    public SmartWatch shape(String shape) {
        this.shape = shape;
        return this;
    }

    public SmartWatch bandMaterial(String bandMaterial) {
        this.bandMaterial = bandMaterial;
        return this;
    }

    public SmartWatch bluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    public SmartWatch wifi(boolean wifi) {
        this.wifi = wifi;
        return this;
    }

    // getters & setters
    public void setShape(String shape) {
        this.shape = shape;
    }
    public String getShape() {
        return this.shape;
    }

    public void setBandMaterial(String bandMaterial) {
        this.bandMaterial = bandMaterial;
    }
    public String getBandMaterial() {
        return this.bandMaterial;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
    public boolean getBluetooth() {
        return this.bluetooth;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    public boolean getWifi() {
        return this.wifi;
    }

}
