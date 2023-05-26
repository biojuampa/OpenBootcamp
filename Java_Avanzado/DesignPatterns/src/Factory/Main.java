package Factory;

public class Main {
    public static void main(String[] args) {
        PriceFactory priceEU = new PriceFactory("España");
        System.out.println(priceEU.getPrice());

        PriceFactory priceGBP = new PriceFactory("UK");
        System.out.println(priceGBP.getPrice());

        PriceFactory priceUSA = new PriceFactory("USA");
        System.out.println(priceUSA.getPrice());
    }
}
