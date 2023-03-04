public class Funciones {
    public static void main (String[] args) {
        nada();
        parametros(5, "Hola :)");
        System.out.println(entero());
        System.out.println(entero(10));
        System.out.println(enteroObjeto());
        System.out.println(flotante());
    }

    private static void nada () {
        System.out.println("No devuelvo nada (void)");
    }

    private static void parametros (int numero, String palabra) {
        System.out.println("Recibo los parámetros: «" + numero + "» y «" + palabra + "».");
    }
    
    private static int entero () {                  // Sobrecarga
        System.out.print("Retorno un «int»: ");
        return 5;
    }
    
    private static int entero (int num) {           // Sobrecarga
        System.out.print("Retorno un «int» recibido por parámetro: ");
        return num;
    }
    
    private static Integer enteroObjeto () {
        System.out.print("Retorno un «Integer» que puede ser «null»: ");
        return null;
    }
    
    private static float flotante () {
        System.out.print("Retorno un «float»: ");
        return 12.5f;
    }
}
