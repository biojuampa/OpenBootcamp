public class Clases {
    public static void main(String[] args) {
        Habitacion habitacion1 = new Habitacion();
        habitacion1.sumarPersona();
        habitacion1.sumarPersona();
        habitacion1.sumarPersona();
        System.out.println(habitacion1.getPersonas());
        
        Habitacion habitacion2 = new Habitacion(20);
        habitacion2.restarPersona();
        habitacion2.restarPersona();
        System.out.println(habitacion2.getPersonas());
    }
}

public class Habitacion {
    // Atributos de Clase
    private int personas;

    // Constructores con Sobrecarga
    public Habitacion() {
        this.personas = 0;
    }

    public Habitacion(int personas) {
        this.personas = personas;
    }

    // Métodos de Clase
    public void sumarPersona() {
        this.personas++;
    }
    
    public void restarPersona() {
        if (this.personas > 1)
            this.personas--;
    }

    public int getPersonas() {
        return this.personas;
    }
}

