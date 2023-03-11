public class Screen {
    
    // Atributos
    private short width;      // pixels
    private short height;     // pixels
    private String technology;

    // Constructores
    public Screen() {}

    public Screen(short width,     
                  short height,    
                  String technology
    ) {
        
        this.width = width;    
        this.height = height;   
        this.technology = technology;
    
    }

    // Métodos getter y setter
    public void setWidth(short width) {
        this.width = width;
    }
    public short getWidth() {
        return this.width;
    }

    public void setHeight(short height) {
        this.height = height;
    }
    public short getHeight() {
        return this.height;
    }
    
    public void setTechnology(String technology) {
        this.technology = technology;
    }
    public String getTechnology() {
        return this.technology;
    }

}
