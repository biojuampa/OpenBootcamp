package behavioralPatterns.state;

public class EstadoDesbloqueado extends Estado {
    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): Ya estaba desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "abrirCamara(): Cámara abierta";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): Primero debes abrir la cámara.";
    }
}
