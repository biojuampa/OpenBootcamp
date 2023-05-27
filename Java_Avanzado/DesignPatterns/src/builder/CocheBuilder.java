package builder;

public class CocheBuilder {
    private Coche coche;

    public CocheBuilder(String marca) {
        this.coche = new Coche(marca);
    }

    public CocheBuilder setMotor(String motor) {
        coche.setMotor(motor);
        return this;
    }

    public CocheBuilder setModelo(String modelo) {
        coche.setModelo(modelo);
        return this;
    }

    public CocheBuilder setPotencia(int potencia) {
        coche.setPotencia(potencia);
        return this;
    }

    public CocheBuilder setPuertas(int puertas) {
        coche.setPuertas(puertas);
        return this;
    }

    public Coche build() {
        return coche;
    }

}
