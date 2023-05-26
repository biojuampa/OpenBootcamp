package Factory;

public class PriceFactory {
    private Price price;

    private PriceFactory() {}
    public PriceFactory(String country) {
        if (country.equalsIgnoreCase("españa")) {
            price = new PriceEUR();
            System.out.println("Precio España");
        } else {
            price = new PriceUSD();
            System.out.println("Precio otro país");
        }
    }

    public float getPrice() {
        return price.getPrice();
    }
}
