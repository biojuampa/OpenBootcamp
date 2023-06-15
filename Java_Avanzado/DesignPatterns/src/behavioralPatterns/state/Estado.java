package behavioralPatterns.state;

public abstract class Estado {
    private Telefono telefono;

    public Estado(Telefono telefono) {
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public abstract String desbloquear();
    public abstract String abrirCamara();
    public abstract String hacerFoto();
}
