package behavioralPatterns.state;

public class EstadoBloqueado extends Estado {
    public EstadoBloqueado(Telefono telefono) {
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
