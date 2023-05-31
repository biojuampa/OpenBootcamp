package structuralPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.create();

        System.out.println();

        SmartPhone smartPhone = new SmartPhone(
                new BasicPhone()
        );
        smartPhone.create();

        System.out.println();

        NextGenPhone nextGenPhone = new NextGenPhone(
                new SmartPhone(
                        new BasicPhone()
                )
        );
        nextGenPhone.create();

        System.out.println();

        RegularPhone regularPhone = new RegularPhone();
        regularPhone.create();

        System.out.println();

        NextGenPhone nextGenPhone1 = new NextGenPhone(new SmartPhone(new RegularPhone()));
        nextGenPhone1.create();
    }
}
