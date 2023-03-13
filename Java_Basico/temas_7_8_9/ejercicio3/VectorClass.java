import java.util.Vector;


public class VectorClass {
    public static void main(String[] args) {
        
        Vector<String> nombres = new Vector<String>(); 

        nombres.add("Juan Pedro");
        nombres.add("María Lidia");
        nombres.add("Raúl Eduardo");
        nombres.add("Jesuele");
        nombres.add("Alan Sastre");
        
        // nombres antes del borrado
        System.out.println(nombres);
        System.out.println("Borrando ...");
        
        nombres.remove(1);  // El índice se desplaza, por tanto
        nombres.remove(1);  // ahora el tercer elemento pasa a ser el segundo.

        // nombres después del borrado
        System.out.println(nombres);

    }
}

