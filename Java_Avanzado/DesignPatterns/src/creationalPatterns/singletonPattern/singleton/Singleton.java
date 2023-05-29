package creationalPatterns.singletonPattern.singleton;

public class Singleton {

    // Atributos
    private int contador;
    private static Singleton singleton;

    // Constructor
    private Singleton() {} // Esto lo hace Víctor pero no es necesario

    // Métodos
    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();

        return singleton;
    }

    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }

}
