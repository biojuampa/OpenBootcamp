import java.util.Map;
import java.util.HashMap;


public class Mapas {
    public static void main(String[] args) {

        Map<String, String> datos = new HashMap<>();

        datos.put("25616768", "Camussi, Juan Pablo");
        datos.put("25236768", "Perez, Juan Pedro");
        datos.put("26576768", "Ruiz, Juan Luis");
        datos.put("21236768", "García, Juan José");
        datos.put("25613458", "Del Vecchio, Juan Ignacio");

        System.out.println(datos);
        
        // Claves
        System.out.println("\nClaves:");
        System.out.println("-------");
        for (String clave: datos.keySet())
            System.out.println(clave);
        
        // Valores
        System.out.println("\nValores:");
        System.out.println("--------");
        for (String valor: datos.values())
            System.out.println(valor);
        
        // Pares clave-valor
        System.out.println("\nPares clave-valor:");
        System.out.println("------------------");
        for (Map.Entry<String, String> pair: datos.entrySet())
            System.out.println(pair);

        // Otra forma sería
        System.out.println("\nPares clave-valor (otra forma):");
        System.out.println("-------------------------------");
        for (Map.Entry<String, String> pair: datos.entrySet())
            System.out.println("El DNI de " + pair.getValue() + " es " + pair.getKey());

    }
}

