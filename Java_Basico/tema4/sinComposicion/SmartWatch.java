public class SmartWatch extends SmartDevice {

    // Atributos
    private float price;
    private String brand;
    private String model;
    private String shape;
    private String specialFeatures;
    private String bandMaterial;
    private float discountPercent = -1;
    private boolean bluetooth;
    private boolean wifi;

    // Constructores
    public SmartWatch() {};

    public SmartWatch(short screenWidth,    
                      short screenHeight,   
                      float weight,         
                      short batteryCapacity,
                      int batteryDuration,  
                      String screenTecnology,
                      String operatingSystem,
                      float price,
                      String brand,
                      String model,
                      String shape,
                      String specialFeatures,
                      String bandMaterial
    ) {

        super(screenWidth,    
                          screenHeight,   
                          weight,         
                          batteryCapacity,
                          batteryDuration,  
                          screenTecnology,
                          operatingSystem
        );

        this.price = price;
        this.brand = brand;
        this.model = model;
        this.shape = shape;
        this.specialFeatures = specialFeatures;
        this.bandMaterial = bandMaterial;

    }

    // Métodos
    public float getPriceWithDiscount() {
        float discount = this.discountPercent;
        if (discount > 0 && discount <= 100)
            return this.price * (1 + discount/100);
        else
            return -1;
    }

    // getters & setters
    public void setPrice(float price) {
        this.price = price;
    }
    public float getPrice() {
        return this.price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    public String getShape() {
        return this.shape;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
    public String getSpecialFeatures() {
        return this.specialFeatures;
    }

    public void setBandMaterial(String bandMaterial) {
        this.bandMaterial = bandMaterial;
    }
    public String getBandMaterial() {
        return this.bandMaterial;
    }
    
    public void setDiscountPercent(float discount) {
        this.discountPercent = discount;
    }
    public float getDiscountPercent() {
        return this.discountPercent;
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
