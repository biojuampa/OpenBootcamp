import java.util.Scanner;


public class PrecioConIva {
    public static void main(String[] args) {

        System.out.print("Dime un precio: ");
        Scanner entrada = new Scanner(System.in);

        double precio = entrada.nextDouble();
        double precioConIva = getPrecioConIva(precio);

        System.out.println("El precio con IVA es " + precioConIva);
    
    }

    private static double getPrecioConIva(double precio) {
    /*
     * En Argentina el IVA es del 21%
     *
     * Nota: Pongo paréntesis en el retorno por
     *       claridad, no porque sea necesario.
     */
        return (1.21 * precio);
    }
}

