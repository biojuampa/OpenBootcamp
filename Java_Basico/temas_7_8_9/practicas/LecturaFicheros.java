import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


public class LecturaFicheros {
    public static void main(String[] args) {
        
        final String ARCHIVO = "promesas.txt";
        final int BS = 5;   // Block Size

        System.out.println("\n\n ==============================\n"
                         +     " Leyendo todo el archivo de una\n"
                         +     " ==============================\n"
                          );

        readAll(ARCHIVO);
        
        System.out.println("\n\n ==============================\n"
                         +     " Leyendo el archivo de a 1 byte\n"
                         +     " ==============================\n"
                          );

        readByByte(ARCHIVO);
        
        System.out.println("\n\n ==============================\n"
                         +     " Leyendo el archivo por bloques\n"
                         +     " ==============================\n"
                          );

        readByBlock(ARCHIVO, BS);

    }
    
    public static void readAll(String fichero) {

        // Leyendo todo el fichero de una
        try {
            InputStream archivo = new FileInputStream(fichero);
            try {
                byte[] datos = archivo.readAllBytes();
                for (byte dato: datos) {
                    System.out.print((char)dato);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
        }

    }
    
    public static void readByByte(String fichero) {

        // Leyendo el fichero byte por byte
        try {
            InputStream archivo = new FileInputStream(fichero);
            try {
                int dato = archivo.read();
                while (dato != -1) { // EOF = -1
                    System.out.print((char)dato);
                    dato = archivo.read();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
        }

    }
    
    public static void readByBlock(String fichero, int bs) {

        // Leyendo el fichero por bloques definidos
        try {
            InputStream archivo = new FileInputStream(fichero);
            byte[] datos = new byte[bs];
            try {
                int bc = 0;
                while (archivo.read(datos) != -1) {
                    bc++;
                    for (int i = 0; i < datos.length; i++) {
                        System.out.print((char)datos[i]);
                        datos[i] = 0;  // limpio el array antes de la próxima lectura
                    }
                }
                System.out.printf("%n *** Se leyeron %d bloques *** %n%n", bc);
            } catch (IOException e) {
                    System.out.println(e.getMessage());
            }
        
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
        }

    }
}
