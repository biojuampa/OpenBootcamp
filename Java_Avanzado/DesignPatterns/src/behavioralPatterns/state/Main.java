package behavioralPatterns.state;

public class Main {
    public static void main(String[] args) {
        Telefono telefono = new Telefono();

        System.out.println(telefono.getEstado().desbloquear());
        System.out.println(telefono.getEstado().abrirCamara());
        System.out.println(telefono.getEstado().hacerFoto());
        System.out.println(telefono.getEstado().hacerFoto());
        System.out.println(telefono.getEstado().hacerFoto());
    }
}
