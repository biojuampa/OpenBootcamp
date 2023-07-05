import java.util.Arrays;

public class MayorYMenor {
    public static void imprimeMayorYMenor1(int[] numeros) {
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (mayor < numeros[i])
                mayor = numeros[i];

            if (menor > numeros[i])
                menor = numeros[i];
        }

        System.out.println("Caso 1: (" + mayor + " ; " + menor + ")");
    }

    public static void imprimeMayorYMenor2(int[] numeros) {
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (mayor < numero) mayor = numero;
            if (menor > numero) menor = numero;
        }

        System.out.println("Caso 2: (" + mayor + " ; " + menor + ")");
    }

    public static void imprimeMayorYMenor3(int[] numeros) {
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            mayor = mayor > numero ? mayor : numero;
            menor = menor < numero ? menor : numero;
        }

        System.out.println("Caso 3: (" + mayor + " ; " + menor + ")");
    }

    public static void imprimeMayorYMenor4(int[] numeros) {
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);
        }

        System.out.println("Caso 4: (" + mayor + " ; " + menor + ")");
    }

    // Funcional
    public static void imprimeMayorYMenor5(int[] numeros) {
        int mayor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> a > b ? a : b);
        int menor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> a < b ? a : b);
        System.out.println("Caso 5: (" + mayor + " ; " + menor + ")");
    }

    public static void imprimeMayorYMenor6(int[] numeros) {
        int mayor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> Math.max(a, b));
        int menor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> Math.min(a, b));
        System.out.println("Caso 6: (" + mayor + " ; " + menor + ")");
    }

    public static void imprimeMayorYMenor7(int[] numeros) {
        int mayor = Arrays.stream(numeros).reduce(numeros[0], Math::max);
        int menor = Arrays.stream(numeros).reduce(numeros[0], Math::min);
        System.out.println("Caso 7: (" + mayor + " ; " + menor + ")");
    }
}
