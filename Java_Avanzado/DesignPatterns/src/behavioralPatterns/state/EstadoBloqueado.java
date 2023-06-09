package behavioralPatterns.state;

public class EstadoBloqueado extends Estado {
    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "desbloquear(): Teléfono desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): Primero debes desbloquear el teléfono.";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): Primero debes desbloquear el teléfono.";
    }
}
