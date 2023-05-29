package creationalPatterns.singletonPattern.application;

public class Main {
    public static void main(String[] args) {
        Application app = Application.getInstance();
        Application app2 = Application.getInstance();

        app.run();
        System.out.println(app);

        app2.run();
        System.out.println(app2);
    }
}
