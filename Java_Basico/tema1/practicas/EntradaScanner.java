import java.util.Scanner;


public class EntradaScanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Dime tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Dime tu edad: ");
        int edad = entrada.nextInt();

        System.out.print("\n  Hola " + nombre + ", ");

        if (edad < 0)
            System.out.print("aún no has nacido, paciencia ...");
        else if (edad == 0)
            System.out.print("bienvenido a la tierra :)");
        else if (edad < 15)
            System.out.print("eres un niño ...");
        else if (edad < 30)
            System.out.print("eres un adolescente ...");
        else if (edad < 70)
            System.out.print("ya eres un adulto :(");
        else if (edad < 120)
            System.out.print("¡ten una buena vida!");
        else
            System.out.print("¡qué longevo has resultado! :/");           

        System.out.println("\n");

    }
}

