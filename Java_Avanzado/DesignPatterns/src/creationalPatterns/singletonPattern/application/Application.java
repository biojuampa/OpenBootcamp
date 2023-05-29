package creationalPatterns.singletonPattern.application;

public class Application {
    private static Application application;
    boolean isRunning = false;

    private Application() {}

    public static Application getInstance() {
        if (application == null)
            application = new Application();

        return application;
    }

    public void run() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Creando instancia nueva");
        } else
            System.out.println("Ya está en ejecución");
    }
}
