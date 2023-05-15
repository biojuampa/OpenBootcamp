import java.util.stream.IntStream;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial iterativo: " + factorialIterativo(5));
        System.out.println("Factorial Recursivo: " + factorialRecursivo(5));
        System.out.println("Factorial Head Recursion: " + factorialHeadRecursion(5));
        System.out.println("Factorial Tail Recursion: " + factorialTailRecursion(5));
        System.out.println("Factorial Funcional: " + factorialFuncional(5));
    }

    // Factorial iterativo
    private static long factorialIterativo(int n) {
        long factorial = 1L;
        for (int i=1; i<=n; i++)
            factorial *= i;

        return factorial;
    }

    // Factorial recursivo típico (sería tail recursion)
    private static long factorialRecursivo(int n) {
        if (n == 1) return 1L;
        return n * factorialRecursivo(n-1);
    }

    // Factorial head recursion
    private static long factorialHead = 1;
    private static long factorialHeadRecursion(int n) {
        if (n == 1) return 1L;
        factorialHeadRecursion(n-1);
        factorialHead *= n;
        return factorialHead;
    }

    // Factorial tail recursion
    private static long factorialTail = 1L;
    private static long factorialTailRecursion(int n) {
        if (n == 1) return 1L;
        factorialTail *= n;
        factorialTailRecursion(n-1);
        return factorialTail;
    }

    private static long factorialFuncional(int n) {
        return (long)IntStream
                .rangeClosed(1,n)
                .reduce(1, (x,y) -> x*y)
                ;
    }
}
