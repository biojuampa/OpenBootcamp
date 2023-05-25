package Factory;

public class PriceFactory {
    private Price price;

    private PriceFactory() {}
    public PriceFactory(String country) {
        if (country.equalsIgnoreCase("españa")) {
            price = new PriceEUR();
            System.out.println("País España");
        } else {
            price = new PriceUSD();
            System.out.println("Otro País");
        }
    }

    public Price getPrice() {
        return price;
    }
}
