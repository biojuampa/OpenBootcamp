public class ThrowException {
    public static void main(String[] args) {
        
        double result;

        try {
            
            result = dividePorCero(12, 12);
            System.out.println("\n 12 / 12 = " + result);

            result = dividePorCero(12, 0);  // aquí se genera la excepción
            System.out.println("\n 12 / 0 = " + result);  // este código nunca se ejecuta

        } catch (ArithmeticException e) {
            
            System.out.println(e.getMessage());

        } finally {
            
            System.out.println("\nDemo de código\n");        
        
        }

    }

    private static double dividePorCero(double a, double b) throws ArithmeticException {

        if (b == 0)
            throw new ArithmeticException("¡Esto no se puede hacerse!");

        double result = a / b;
        return result;

    }
}
