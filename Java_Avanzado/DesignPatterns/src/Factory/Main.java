package Factory;

public class Main {
    public static void main(String[] args) {
        PriceFactory priceEU = new PriceFactory("España");
        System.out.println(priceEU.getPrice());

        PriceFactory priceGB = new PriceFactory("UK");
        System.out.println(priceGB.getPrice());

        PriceFactory priceUSA = new PriceFactory("USA");
        System.out.println(priceUSA.getPrice());
    }
}
