import java.util.Vector;


public class VectorTest {
    public static void main(String[] args) {
        
        final int QUANTITY_ITEMS = 1000;  // Cantidad de elementos a poner en el array dinámico

        Vector<Integer> vector = new Vector<>();

        int actualCapacity = 10;
        int resizes = 0;
        int lastResize = 0;
        for (int i = 0; i < QUANTITY_ITEMS; i++) {
            vector.add(i);
            if (vector.capacity() == actualCapacity) continue;
            lastResize = vector.capacity() - actualCapacity;
            actualCapacity = vector.capacity();
            resizes++;
        }

        System.out.println("Capacidad: " + vector.capacity());
        System.out.println("Tamaño: " + vector.size());
        System.out.println("Redimensiones: " + resizes);
        System.out.println("Última redimensión: " + lastResize);
            
    }
}

