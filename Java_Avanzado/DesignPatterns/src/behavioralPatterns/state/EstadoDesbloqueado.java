package behavioralPatterns.state;

public class EstadoDesbloqueado extends Estado {
    public EstadoDesbloqueado(Telefono telefono) {
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
