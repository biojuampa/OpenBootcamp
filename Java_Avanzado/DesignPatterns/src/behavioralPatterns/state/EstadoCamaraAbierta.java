package behavioralPatterns.state;

public class EstadoCamaraAbierta extends Estado {
    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): Ya estaba desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): Ya estaba abierta.";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "hacerFoto(): Se tomará la foto ...";
    }
}
