import excepciones.ArchivoNoExisteException;
import excepciones.DivisionPorCeroException;
import excepciones.FueraDeLimitesException;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Excepciones {
    public static void main(String[] args) {
        try {
            System.out.println(dividirEnteros(33, 0));
        } catch (Exception e) {
            System.out.println("Error realizando la división: " + e.getMessage());
        }

        try {
            System.out.println(devolverIndiceArray(9));
        } catch (Exception e) {
            System.out.println("Error leyendo el array: " + e.getMessage());
        }

        try {
            abrirArchivo("archivo.txt");
        } catch (Exception e) {
            System.out.println("Error abriendo el archivo: " + e.getMessage());
        }
    }

    public static double dividirEnteros(int numerador, int divisor) throws DivisionPorCeroException {
        if (divisor == 0) {
            throw new DivisionPorCeroException("¡No puedes dividir un entero por cero!");
        }

        return (double) numerador / divisor;
    }

    public static int devolverIndiceArray(int index) throws FueraDeLimitesException {
        int[] numeros = {1,2,3,4,5,6};

        if (0 > index || index >= numeros.length) {
            throw new FueraDeLimitesException("Se pide el índice "
                    + index
                    + ", pero se tienen "
                    + numeros.length
                    + " elementos."
            );
        }

        return numeros[index];
    }

    public static void abrirArchivo(String rutaArchivo) throws ArchivoNoExisteException {
        try {
            InputStream inputStream = new FileInputStream(rutaArchivo);
            inputStream.close();

        } catch (Exception e) {
            if (! Files.exists(Path.of(rutaArchivo))) {
                throw new ArchivoNoExisteException(rutaArchivo);
            }

            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
