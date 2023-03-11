public class SmartPhone extends SmartDevice {

    // Atributos
    private boolean nfc;
    private boolean dualSim;
    private boolean footprintReader;
    private byte cameras; 
    private String networkTech;         // GSM, LTE, 5G , etc.
    private boolean pen;
    private boolean fmRadio;

    // Constructores
    public SmartPhone() {}

    public SmartPhone(float price,
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
                      String operatingSystem,
                      boolean nfc,
                      boolean dualSim,
                      boolean footprintReader,
                      byte cameras, 
                      String networkTech,     
                      boolean pen,
                      boolean fmRadio
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
              screenTechnology,
              operatingSystem
        );

        this.nfc = nfc;
        this.dualSim = dualSim;
        this.footprintReader = footprintReader;
        this.cameras = cameras;
        this.networkTech = networkTech;   
        this.pen = pen;
        this.fmRadio = fmRadio;

    }

    // getters & setters
    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }
    public boolean getNfc() {
        return this.nfc;
    }

    public void setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
    }
    public boolean getDualSim() {
        return this.dualSim;
    }

    public void setFootprintReader(boolean footprintReader) {
        this.footprintReader = footprintReader;
    }
    public boolean getFootprintReader() {
        return this.footprintReader;
    }

    public void setCameras(byte cameras) {
        this.cameras = cameras;
    }
    public byte getCameras() {
        return this.cameras;
    }

    public void setNetworkTech(String networkTech) {
        this.networkTech = networkTech;
    }
    public String getNetworkTech() {
        return this.networkTech;
    }

    public void setPen(boolean pen) {
        this.pen = pen;
    }
    public boolean getPen() {
        return this.pen;
    }

    public void setFmRadio(boolean fmRadio) {
        this.fmRadio = fmRadio;
    }
    public boolean getFmRadio() {
        return this.fmRadio;
    }

}
