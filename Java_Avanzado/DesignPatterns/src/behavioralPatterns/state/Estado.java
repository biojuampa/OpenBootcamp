package behavioralPatterns.state;

public abstract class Estado {
    protected Telefono telefono;

    public Estado(Telefono telefono) {
        this.telefono = telefono;
    }

    public abstract String desbloquear();
    public abstract String abrirCamara();
    public abstract String hacerFoto();
}
