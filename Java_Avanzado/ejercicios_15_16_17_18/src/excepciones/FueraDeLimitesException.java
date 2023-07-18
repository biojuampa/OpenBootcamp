package excepciones;

public class FueraDeLimitesException extends ArrayIndexOutOfBoundsException {
    public FueraDeLimitesException(String message) {
        super("Índice fuera de los límites: " + message);
    }

    public FueraDeLimitesException(int index) {
        super(index);
    }
}
