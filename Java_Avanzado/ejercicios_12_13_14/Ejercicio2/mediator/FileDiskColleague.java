/*
 * Copyright © 2023 <copyright holders>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the “Software”), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package mediator;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>Colega concreto</b> que maneja como medio de almacenamiento un archivo de texto
 * @author Juan Pablo Camussi
 * @version 1.0.0
 */
public class FileDiskColleague extends  Colleague {
    private final String PATH_FILE = "words.txt";

    /**
     * <b>Constructor</b> - Crea el archivo de almacenamiento vacío, incluso si este existiera (lo sobreescribe)
     */
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
