public class HeadAndTailRecursion {

    public static void main(String[] args) {
        headRecursion(5);
        System.out.println("---");
        tailRecursion(5);
    }

    // Primero la llamda recursiva, después la lógica
    private static void headRecursion(int n) {
        if (n == 0) return;
        headRecursion(n-1);
        System.out.println(" " + n);
    }

    // Primero la lógica, después la llamada recursiva
    private static void tailRecursion(int n) {
        if (n == 0) return;
        System.out.println(" " + n);
        tailRecursion(n-1);
    }

}
