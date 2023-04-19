import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Funcional2 {

    public static void main(String[] args) {

        algunosNumeros();
        algunosNumeros2();

        System.out.println("Fibonacci(5) = " + fibonacci(5));
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

    private static long fibonacci(int n) {

        ArrayList<Integer> listaFibo = new ArrayList<>();
        for (int i=0; i<n; i++)
            listaFibo.add(i+1);

        long fibo = listaFibo.stream().reduce(1, (x,y) -> x+y);

        return fibo;

    }

    private static long factorial(int n) {

        Integer[] numeros = new Integer[n];
        for (int i=0; i<n; i++)
            numeros[i] = i + 1;

        long factorial = Arrays.stream(numeros).reduce(1, (x,y) -> x*y);
        return factorial;

    }

}
