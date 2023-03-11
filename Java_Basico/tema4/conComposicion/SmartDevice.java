public abstract class SmartDevice {

    // Atributos
    private float price;            // U$D
    private float discountPercent = -1;
    private String name;
    private String brand;
    private String model;
    private String specialFeatures;
    private float weight;           // grs
    private short batteryCapacity;  // mah
    private int batteryDuration;    // seconds
    private String operatingSystem;
    private Screen screenDetails;
//    private Screen screenDetails = new Screen();
  
    // Constructores
    public SmartDevice() {}

    public SmartDevice(float price,
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
                       String screenTechnology,
                       String operatingSystem
    ) {
        
        this.price = price;
        this.discountPercent = discountPercent;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.specialFeatures = specialFeatures;
        this.weight = weight;         
        this.batteryCapacity = batteryCapacity;
        this.batteryDuration = batteryDuration;
        this.operatingSystem = operatingSystem;
//        this.screenDetails.setWidth = screenWidth;    
//        this.screenDetails.setHeight = screenHeight;   
//        this.screenDetails.setTechnology = screenTechnology;
        this.screenDetails = new Screen(screenWidth,
                                        screenHeight,
                                        screenTechnology
                                        );

    }
    
    // Métodos
    public float getPriceWithDiscount() {
        float discount = this.discountPercent;
        if (discount > 0 && discount <= 100)
            return this.price * (1 - discount/100);
        else
            return -1;
    }

    public String toString() {
        return this.brand + " " + this.name + " " + this.model;
    }
    
    // Métodos setter and getter
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
    }

    public void setBatteryDuration(int batteryDuration) {
        this.batteryDuration = batteryDuration;
    }
    public int getBatteryDuration() {
        return this.batteryDuration;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    // Getter and setter for Screen object
    public void setScreen(Screen screenDetails) {
        this.screenDetails = screenDetails;
    }
    public Screen getScreen() {
        return this.screenDetails;
    }

} 
