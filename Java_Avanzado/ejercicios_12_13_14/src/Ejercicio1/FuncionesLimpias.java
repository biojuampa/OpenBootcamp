package Ejercicio1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FuncionesLimpias {
    public static void main(String[] args) {
        System.out.println(calcularFactorial(5));
        System.out.println(sumarEnteros(21, 14, 68, -81, 0, 33, -65, 128));
    }

    private static long calcularFactorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    private static long sumarEnteros(int... numeros) {
        return Arrays.stream(numeros).reduce(0, Integer::sum);
    }
}
