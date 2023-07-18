package excepciones;

public class DivisionPorCero extends ArithmeticException {
    public DivisionPorCero(String message) {
        super("Error: Se intenta la división de un entero por cero. " + message);
    }
}
