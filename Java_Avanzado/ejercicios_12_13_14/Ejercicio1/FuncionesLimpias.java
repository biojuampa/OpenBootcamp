import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Soy consciente de que las dos funciones que he creado fallan en una regla, son demasiado simples y pueden
 * ser reemplazadas con un inlining en el Main, pero por cuestiones prácticas y de tiempo (y falta de creatividad) he
 * decidido que es suficiente como ejercicio de funciones limpias. Pasando por alto ese detalle, creo que por lo demás
 * cumplo con el cometido de crear un código limpio.
 */
public class FuncionesLimpias {
    public static void main(String[] args) {
        System.out.println("Factorial: " + calcularFactorial(5));
        System.out.println("Sumatoria: " + sumarEnteros(21, 14, 68, -81, 0, 33, -65, 128));
    }

    private static long calcularFactorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    private static long sumarEnteros(int... numeros) {
        return Arrays.stream(numeros).reduce(0, Integer::sum);
    }
}
