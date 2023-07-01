import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class StringsFileDisk implements StringsIterator {
    private final Path RUTA_ARCHIVO = Path.of("words.txt");

    private int index = 0;
    private int totalLines = 0;

    public StringsFileDisk() {
        // Crear el archivo words.txt vacío (aunque exista)
        try {
            if (Files.exists(RUTA_ARCHIVO))
                Files.delete(RUTA_ARCHIVO);

            Files.createFile(RUTA_ARCHIVO);

        } catch (Exception e) {
            System.out.println("Error creando el archivo: " + e.getMessage());
        }

    }

    @Override
    public void addNewWord(String word) {
        // Escribir palabra en archivo
        // Incrementar variable totalLines
        try (BufferedWriter file = Files.newBufferedWriter(RUTA_ARCHIVO, StandardOpenOption.APPEND)) {
            file.write(word);
            file.newLine();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        totalLines++;
    }

    @Override
    public String next() {
        // Crear streams con las líneas del archivo
        // Leer y retornar la línea nro. index
        String line = "";

        try (Stream<String> lines = Files.lines(RUTA_ARCHIVO)) {
            line =  lines
                    .skip(index)
                    .findFirst()
                    .get()
            ;

            index++;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return line;
    }

    @Override
    public boolean hasMore() {
        // Si totalLines > index => true
        // Si no => false
        return totalLines > index;
    }

    @Override
    public void reset() {
        index = 0;
    }
}
