import java.util.ArrayList;
import java.util.stream.IntStream;

public class PruebaStreams {

    public static void main(String[] args) {

        ArrayList<Double> flotantes = new ArrayList<>();
        IntStream.rangeClosed(1,10).forEach(x -> flotantes.add(x/Math.random()));
        flotantes.forEach(f -> System.out.print(f + ", "));

        Integer suma = sumaPrimerosPares(50);
        System.out.println("Suma primeros pares hasta 50 = " + suma);

        imprimePrimerosPares(10);

        int fact = factorial(15);
        System.out.println("Factorial de 15 = " + fact);

    }

    private static void imprimePrimerosPares(int n) {

        ArrayList<Integer> numeros = new ArrayList<>();
        IntStream.rangeClosed(1,n).forEach(x -> numeros.add(x));
        numeros.forEach(x -> System.out.print(x + " "));
        System.out.println();

    }

    private static Integer sumaPrimerosPares(int n) {

        return IntStream.rangeClosed(1,n)
                .filter(x -> x%2 == 0)
                .reduce(0, (x,y) -> x+y)
                ;

    }

    private static int factorial(int n) {

        return IntStream.rangeClosed(1,n)
                .reduce(1, (x,y) -> x*y)
                ;

    }

}
