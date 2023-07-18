import excepciones.DivisionPorCero;

public class Excepciones {
    public static void main(String[] args) {
        dividePorCero(23);
    }

    public static double dividePorCero(int numero) throws ArithmeticException {
        throw new DivisionPorCero("¡No puedes dividir un entero por cero!");
    }

    public static void fueraDeLimites() throws ArrayIndexOutOfBoundsException {

    }

    public static void archivoNoExiste() {

    }
}
