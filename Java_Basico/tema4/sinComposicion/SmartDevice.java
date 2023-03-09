public class SmartDevice {

    // Atributos
    private short screenWidth;      // pixels
    private short screenHeight;     // pixels
    private float weight;           // grs
    private short batteryCapacity;  // mah
    private int batteryDuration;    // seconds
    private String screenTecnology;
    private String operatingSystem;

    // Constructores
    public SmartDevice() {}

    public SmartDevice(short screenWidth,     
                            short screenHeight,    
                            float weight,          
                            short batteryCapacity, 
                            int batteryDuration,   
                            String screenTecnology,
                            String operatingSystem
    ) {
        
        this.screenWidth = screenWidth;    
        this.screenHeight = screenHeight;   
        this.weight = weight;         
        this.batteryCapacity = batteryCapacity;
        this.batteryDuration = batteryDuration;
        this.screenTecnology = screenTecnology;
        this.operatingSystem = operatingSystem;

    }
    
    // Métodos setter and getter
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
        this.screenWidth = screenWidth;
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

    public void setScreenTecnology(String screenTecnology) {
        this.screenTecnology = screenTecnology;
    }
    public String getScreenTecnology() {
        return this.screenTecnology;
    } //

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

} 
