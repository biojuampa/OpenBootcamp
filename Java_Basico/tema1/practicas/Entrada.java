import java.io.Console;

public class Entrada {
    public static void main (String[] args) {
        Console input = System.console();
        
        System.out.print("¿Cómo te llamas?: ");
        String str = input.readLine();

        System.out.println("Hola, " + str);
    }
}

