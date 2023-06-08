package behavioralPatterns.observer;

public class Main {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();

        emisor.agregaReceptor(new Radio());
        emisor.agregaReceptor(new Television());
        emisor.agregaReceptor(new Satelite());

        emisor.habla();
    }
}
