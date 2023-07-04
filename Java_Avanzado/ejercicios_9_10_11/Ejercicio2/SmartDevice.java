public abstract class SmartDevice {

    // Atributos
    private float price;            // U$D
    private float discountPercent = -1;
    private String name;
    private String brand;
    private String model;
    private String specialFeatures;
    private short screenWidth;      // pixels
    private short screenHeight;     // pixels
    private float weight;           // grs
    private short batteryCapacity;  // mah
    private int batteryDuration;    // seconds
    private String screenTechnology;
    private String operatingSystem;

    // Constructores
    public SmartDevice(String name, String brand, String model) {
        this.name = name;
        this.brand = brand;
        this.model = model;
    }

    // Métodos
    // Patrón builder
    public SmartDevice price(float price) {
        this.price = price;
        return this;
    }

    public SmartDevice discountPercent(float discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    public SmartDevice specialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
        return this;
    }

    public SmartDevice screenWidth(short screenWidth) {
        this.screenWidth = screenWidth;
        return this;
    }

    public SmartDevice screenHeight(short screenHeight) {
        this.screenHeight = screenHeight;
        return this;
    }

    public SmartDevice weight(float weight) {
        this.weight = weight;
        return this;
    }

    public SmartDevice batteryCapacity(short batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public SmartDevice batteryDuration(int batteryDuration) {
        this.batteryDuration = batteryDuration;
        return this;
    }

    public SmartDevice screenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
        return this;
    }

    public SmartDevice operatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    // toString
    public String toString() {
        return this.brand + " " + this.name + " " + this.model;
    }

    // Métodos setter and getter
    public float getPriceWithDiscount() {
        float discount = this.discountPercent;
        if (discount > 0 && discount <= 100)
            return this.price * (1 - discount/100);
        else
            return -1;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public float getPrice() {
        return this.price;
    }
    
    public void setDiscountPercent(float discount) {
        this.discountPercent = discount;
    }
    public float getDiscountPercent() {
        return this.discountPercent;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
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

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
    public String getSpecialFeatures() {
        return this.specialFeatures;
    }

    public void setScreenWidth(short screenWidth) {
        this.screenWidth = screenWidth;
    }
    public short getScreenWidth() {
        return this.screenWidth;
    }

    public void setScreenHeight(short screenHeight) {
        this.screenHeight = screenHeight;
    }
    public short getScreenHeight() {
        return this.screenHeight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return this.weight;
    }

    public void setBatteryCapacity(short batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public short getBatteryCapacity() {
        return this.batteryCapacity;
    } //

    public void setBatteryDuration(int batteryDuration) {
        this.batteryDuration = batteryDuration;
    }
    public int getBatteryDuration() {
        return this.batteryDuration;
    } //

    public void setScreenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }
    public String getScreenTechnology() {
        return this.screenTechnology;
    } //

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

} 
