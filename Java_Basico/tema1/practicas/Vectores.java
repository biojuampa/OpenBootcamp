import java.util.Arrays;

public class Vectores {
    public static void main(String[] args) {
        int[] vector1 = new int[5];         // Dos formas distintas
        int[] vector2 = {23,22,21,25,24};   // de declarar un array

        // Lleno vector1
        for (int i=0; i < vector1.length; i++)
            vector1[i] = 21 + i;
        
        System.out.println("--- Vector 1 ---");
        // Recorro vector1 con for
        for (int i=0; i < vector1.length; i++)
            System.out.print(vector1[i] + " ");

        System.out.println("\n\n--- Vector 2 ---");
        // Recorro vector2 con foreach
        for (int valor:vector2)
            System.out.print(valor + " ");

        // Algunos métodos
        System.out.println("\n\nvector1 es el vector2 (mismo objeto) --> " + vector1.equals(vector2));
        System.out.println("vector1 = vector2 (mismos valores) --> " + Arrays.equals(vector1, vector2));
       
        System.out.println("\nBuscando el valor 23 en vector2 ...");
        System.out.println("Encontrado en posición: " + Arrays.binarySearch(vector2, 23));

        System.out.println("\nOrdenando vector2 ...");
        System.out.println("\n--- Vector 2 ---");
        Arrays.sort(vector2);
        for (int valor:vector2)
            System.out.print(valor + " ");
         
        System.out.println("\n\nvector1 es el vector2 (mismo objeto) --> " + vector1.equals(vector2));
        System.out.println("vector1 = vector2 (mismos valores) --> " + Arrays.equals(vector1, vector2));
        
        System.out.println("\nBuscando el valor 23 en vector2 ...");
        System.out.println("Encontrado en posición: " + Arrays.binarySearch(vector2, 23));

    }
}
