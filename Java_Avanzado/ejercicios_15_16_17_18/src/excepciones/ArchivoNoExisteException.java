package excepciones;

import java.io.FileNotFoundException;

public class ArchivoNoExisteException extends FileNotFoundException {
    public ArchivoNoExisteException(String message) {
        super("El archivo no existe: " + message);
    }
}
