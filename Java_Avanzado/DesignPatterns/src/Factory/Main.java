package Factory;

public class Main {
    public static void main(String[] args) {
        PriceFactory priceEU = new PriceFactory("España");
        PriceFactory priceUSA = new PriceFactory("USA");

        System.out.println(priceEU.getPrice().getPrice());
        System.out.println(priceUSA.getPrice().getPrice());
    }
}
