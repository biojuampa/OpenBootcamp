package creationalPatterns.singletonPattern.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.setContador(12);

        System.out.println(singleton.getContador() + " " + singleton);
        System.out.println(singleton2.getContador() + " " + singleton2);

        singleton2.setContador(33);

        System.out.println(singleton.getContador() + " " + singleton);
        System.out.println(singleton2.getContador() + " " + singleton2);

    }
}
