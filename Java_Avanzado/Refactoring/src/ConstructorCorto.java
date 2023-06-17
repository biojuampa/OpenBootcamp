public class ConstructorCorto {
    private final String nombre;
    private String marca;
    private String modelo;
    private String anio;
    private String descripcionCorta;
    private double precio;
    private int cantidad;

    // Constructor corto usando el patrón de diseño builder
    public ConstructorCorto(String nombre) {
        this.nombre = nombre;
    }

    public ConstructorCorto marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ConstructorCorto modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ConstructorCorto anio(String anio) {
        this.anio = anio;
        return this;
    }

    public ConstructorCorto descripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
        return this;
    }

    public ConstructorCorto precio(double precio) {
        this.precio = precio;
        return this;
    }

    public ConstructorCorto cantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnio() {
        return anio;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "ConstructorCorto{" +
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
