public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial iterativo: " + factorial(5));
    }

    // Factorial iterativo
    private static long factorial(int n) {
        long factorial = 1L;
        for (int i=1; i<=n; i++)
            factorial *= i;

        return factorial;
    }

    // Factorial head recursion
    //private static

}
