package structuralPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.create();

        SmartPhone smartPhone = new SmartPhone(
                new BasicPhone()
        );
        smartPhone.create();

        NextGenPhone nextGenPhone = new NextGenPhone(
                new SmartPhone(
                        new BasicPhone()
                )
        );
        nextGenPhone.create();
    }
}
