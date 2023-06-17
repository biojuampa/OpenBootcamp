public class ConstructorHiperMegaUltraLargo {
    private String nombre;
    private String marca;
    private String modelo;
    private String anio;
    private String descripcionCorta;
    private double precio;
    private int cantidad;

    // Constructor hiper mega ultra largo
    public ConstructorHiperMegaUltraLargo(String nombre,
                                          String marca,
                                          String modelo,
                                          String anio,
                                          String descripcionCorta,
                                          double precio,
                                          int cantidad)
    {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.descripcionCorta = descripcionCorta;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Setters and Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }
    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ConstructorHiperMegaUltraLargo{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", descripcionCorta='" + descripcionCorta + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
