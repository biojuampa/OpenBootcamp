package behavioralPatterns.state;

public class EstadoCamaraAbierta extends Estado {
    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return null;
    }

    @Override
    public String abrirCamara() {
        return null;
    }

    @Override
    public String hacerFoto() {
        return null;
    }
}
