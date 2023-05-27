package prototype.cloneable;

public class Coche implements Cloneable {
    private String marca;
    private String modelo;
    private int puertas;

    public Coche clonar() throws CloneNotSupportedException {
        return (Coche)this.clone();
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
