public class SmartWatch extends SmartDevice {

    // Atributos
    private String shape;
    private String bandMaterial;
    private boolean bluetooth;
    private boolean wifi;

    // Constructores
    public SmartWatch() {}

    public SmartWatch(float price,
                      float discountPercent,
                      String name,
                      String brand,
                      String model,
                      String specialFeatures,
                      short screenWidth,
                      short screenHeight,   
                      float weight,         
                      short batteryCapacity,
                      int batteryDuration,  
                      String screenTecnology,
                      String operatingSystem,
                      String shape,
                      String bandMaterial,
                      boolean bluetooth,
                      boolean wifi
    ) {

        super(price,
              discountPercent,
              name,
              brand,
              model,
              specialFeatures,
              screenWidth,    
              screenHeight,   
              weight,         
              batteryCapacity,
              batteryDuration,  
              screenTecnology,
              operatingSystem
        );

        this.shape = shape;
        this.bandMaterial = bandMaterial;
        this.bluetooth = bluetooth;
        this.wifi = wifi;

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
