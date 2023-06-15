package behavioralPatterns.strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios;

        boolean memoria = false;
        if (memoria)
            usuarios = new UsuariosMemoria();
        else
            usuarios = new UsuariosArchivo();

        crear(usuarios,"Juan");
        crear(usuarios,"Pablo");
        crear(usuarios,"Camussi");

        for (String usuario: listar(usuarios))
            System.out.println(usuario);
    }

    public static void crear(Usuarios usuarios, String nombre) {
        usuarios.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios) {
        return usuarios.listar();
    }
}
