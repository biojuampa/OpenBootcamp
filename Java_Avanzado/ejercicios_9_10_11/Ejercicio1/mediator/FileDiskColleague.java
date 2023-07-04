package mediator;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileDiskColleague extends  Colleague {
    private final String PATH_FILE = "words.txt";

    public FileDiskColleague() {
        try {
            FileWriter file = new FileWriter(PATH_FILE);
            file.close();
        } catch (Exception e) {
            System.out.println("No se pudo crear el archivo: " + e.getMessage());
        }
    }

    @Override
    protected void insertWord(String word) {
        try (FileWriter file = new FileWriter(PATH_FILE, true)) {
            file.write(word + "\n");
        } catch (Exception e) {
            System.out.println("Error escribiendo en el archivo: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<String> getAll() {
        List<String> stringList = new ArrayList<>();

        try {
            stringList = Files.readAllLines(Path.of(PATH_FILE));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return (ArrayList<String>) stringList;
    }
}
