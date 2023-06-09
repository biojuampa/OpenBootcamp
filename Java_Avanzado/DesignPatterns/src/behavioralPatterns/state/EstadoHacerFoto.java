package behavioralPatterns.state;

public class EstadoHacerFoto extends Estado {
    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): Ya estaba desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): Y estaba abierta.";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "hacerFoto(): La foto fue tomada.";
    }
}
