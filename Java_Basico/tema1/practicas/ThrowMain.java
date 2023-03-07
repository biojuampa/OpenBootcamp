import java.util.Scanner;


public class ThrowMain {
    public static void main(String[] args) {
    
        try {
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }

    }

    /**
    * Método que lee nombres de consola y verifica que tengan
    * longitud igual o mayor que 8 caracteres.
    * @throws NameFormatException
    */
    private static void leerNombres() throws NameFormatException {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");
        while (teclado.hasNext()) {
            System.out.print("Introduce un nombre: ");
            String nombre = teclado.nextLine();
            if (nombre.length() < 8) {
                teclado.close();
                throw new NameFormatException("El nombre debe contener al menos 8 caracteres");
            }
            
        }
        teclado.close();
    }

}

