/*
*  En este ejercicio básicamente tengo una colección de funciones
*  que hacen exactamente lo mismo, sumar los primeros N números,
*  pero de distintas formas. Aplico lo que he visto hasta ahora en
*  java.
*/

import java.util.stream.IntStream;

public class Sumas {

    public static void main(String[] args) {

        System.out.println("Suma iterativa: " + sumaIterativaPrimerosN(5));
        System.out.println("Suma recursiva: " + sumaRecursivaPrimerosN(5));
        System.out.println("Suma head recursion: " + sumaHeadRecursion(5));
        System.out.println("Suma tail recursion: " + sumaTailRecursion(5));
        System.out.println("Suma Funcional: " + sumaFuncional(5));

    }

    // Suma iterativa
    private static long sumaIterativaPrimerosN(int n) {
        long total = 0;
        for (int i = 1; i <= n; i++)
            total += i;

        return total;
    }

    // Suma recursiva de los primeros n números (sería también tail recursion)
    private static long sumaRecursivaPrimerosN(int n) {
        if (n == 1) return 1L;
        return n + sumaRecursivaPrimerosN(n-1);
    }

    // Suma recursiva por cabeza (head recursion)
    private static long sumaHead = 0;
    private static long sumaHeadRecursion(int n) {
        if (n == 0) return n;
        sumaHeadRecursion(n-1);
        sumaHead += n;
        return sumaHead;
//        return sumaHeadRecursion(n-1) + n;
    }

    // Suma recursiva por cola (tail recursion)
    private static long sumaTail = 0;
    private static long sumaTailRecursion(int n) {
        if (n == 0) return n;
        sumaTail += n;
        sumaTailRecursion(n-1);
        return sumaTail;
//        return n + sumaTailRecursion(n-1);
    }

    private static long sumaFuncional(int n) {
        return IntStream.rangeClosed(1,n)
                .reduce(0, (x,y) -> x+y)
                ;
    }

}
