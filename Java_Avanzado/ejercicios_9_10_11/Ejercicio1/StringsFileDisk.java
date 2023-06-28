import java.io.*;

public class StringsFileDisk implements StringsIterator {
    private final String FILE_PATH = "words.txt";
    private PrintStream file;

    public StringsFileDisk() {
        try {
            FileWriter file = new FileWriter(FILE_PATH);
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addNewWord(String word) {
        try {
            FileWriter file = new FileWriter(FILE_PATH, true);
            file.write(word);
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String next() {
        
        return null; // retorno Fichero.println
    }

    @Override
    public boolean hasMore() {
        return false; // Si no es EOF, retorno true
    }

    @Override
    public void reset() {
        // hacer un peek a Fichero
        // o cerrar y abrir el Fichero
    }
}
