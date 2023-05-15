import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Funcional2 {

    public static void main(String[] args) {

        algunosNumeros();
        algunosNumeros2();

        System.out.println("Suma primeros 5 números = " + sumaPrimerosN(5));
        System.out.println("Factorial(5) = " + factorial(5));
    }

    private static void algunosNumeros() {

        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.stream(numeros)
                .map(x -> x*x*x)
                .filter(x -> x%3 == 0)
                .forEach(System.out::println);

    }

    private static void algunosNumeros2() {

        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        IntStream numerosStream = Arrays.stream(numeros);
        numerosStream.forEach(x -> System.out.print(x + " "));

        System.out.println();

    }

    private static long sumaPrimerosN(int n) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        // Cargo el array
        for (int i=1; i<=n; i++)
            listaNumeros.add(i);

        long suma = listaNumeros.stream().reduce(0, (x,y) -> x+y);

        return suma;

    }

    private static long factorial(int n) {

        Integer[] numeros = new Integer[n];

        // Cargo el array
        for (int i=0; i<n; i++)
            numeros[i] = i + 1;

        long factorial = Arrays.stream(numeros).reduce(1, (x,y) -> x*y);

        return factorial;

    }

}
