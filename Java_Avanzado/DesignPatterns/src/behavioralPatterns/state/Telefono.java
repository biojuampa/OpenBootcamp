package behavioralPatterns.state;

public class Telefono {
    private Estado estado;

    public Telefono() {
        estado = new EstadoBloqueado(this);
    }

    public void cambiaEstado(Estado estado) {
        System.out.println("Estado inicial: " + estado.getClass().getName());
        this.estado = estado;
        System.out.println("Estado final: " + estado.getClass().getName());
    }

    public Estado getEstado() {
        return estado;
    }
}
