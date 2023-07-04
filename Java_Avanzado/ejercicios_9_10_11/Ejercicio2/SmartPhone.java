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
    public SmartPhone(String name, String brand, String model) {
        super(name, brand, model);
    }

    // Métodos
    // Patrón builder
    @Override
    public SmartPhone price(float price) {
        super.price(price);
        return this;
    }

    @Override
    public SmartPhone discountPercent(float discountPercent) {
        super.discountPercent(discountPercent);
        return this;
    }

    @Override
    public SmartPhone specialFeatures(String specialFeatures) {
        super.specialFeatures(specialFeatures);
        return this;
    }

    @Override
    public SmartPhone screenWidth(short screenWidth) {
        super.screenWidth(screenWidth);
        return this;
    }

    @Override
    public SmartPhone screenHeight(short screenHeight) {
        super.screenHeight(screenHeight);
        return this;
    }

    @Override
    public SmartPhone weight(float weight) {
        super.weight(weight);
        return this;
    }

    @Override
    public SmartPhone batteryCapacity(short batteryCapacity) {
        super.batteryCapacity(batteryCapacity);
        return this;
    }

    @Override
    public SmartPhone batteryDuration(int batteryDuration) {
        super.batteryDuration(batteryDuration);
        return this;
    }

    @Override
    public SmartPhone screenTechnology(String screenTechnology) {
        super.screenTechnology(screenTechnology);
        return this;
    }

    @Override
    public SmartPhone operatingSystem(String operatingSystem) {
        super.operatingSystem(operatingSystem);
        return this;
    }

    public SmartPhone nfc(boolean nfc) {
        this.nfc = nfc;
        return this;
    }

    public SmartPhone dualSim(boolean dualSim) {
        this.dualSim = dualSim;
        return this;
    }

    public SmartPhone footprintReader(boolean footprintReader) {
        this.footprintReader = footprintReader;
        return this;
    }

    public SmartPhone cameras(byte cameras) {
        this.cameras = cameras;
        return this;
    }

    public SmartPhone networkTech(String networkTech) {
        this.networkTech = networkTech;
        return this;
    }

    public SmartPhone pen(boolean pen) {
        this.pen = pen;
        return this;
    }

    public SmartPhone fmRadio(boolean fmRadio) {
        this.fmRadio = fmRadio;
        return this;
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
