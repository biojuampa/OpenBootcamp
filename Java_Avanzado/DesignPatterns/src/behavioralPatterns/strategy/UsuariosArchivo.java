package behavioralPatterns.strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosArchivo implements Usuarios {
    private final String ARCHIVO_USUARIOS = "usuarios.txt";
    private PrintStream archivoUsuarios;

    public UsuariosArchivo() {
        try {
            archivoUsuarios = new PrintStream(ARCHIVO_USUARIOS);
        } catch (Exception e) {
            System.out.println("Error manipulando el archivo: " + e.getMessage());
        }
    }

    @Override
    public void crear(String nombre) {
        try {
            archivoUsuarios.println(nombre);
        } catch (Exception e) {
            System.out.println("Error al escribir en archivo: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<String> listar() {
        ArrayList<String> usuarios = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(ARCHIVO_USUARIOS));
            while (scanner.hasNext()) {
                usuarios.add(scanner.next());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error manipulando el archivo: " + e.getMessage());
        }

        return usuarios;
    }
}
