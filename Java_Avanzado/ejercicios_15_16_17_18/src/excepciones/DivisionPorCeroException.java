package excepciones;

public class DivisionPorCeroException extends ArithmeticException {
    public DivisionPorCeroException(String message) {
        super("Se intenta la división de un entero por cero. " + message);
    }
}
