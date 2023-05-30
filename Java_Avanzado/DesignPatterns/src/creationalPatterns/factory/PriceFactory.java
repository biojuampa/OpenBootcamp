package creationalPatterns.factory;

public class PriceFactory {
    private Price price;

    public PriceFactory() {}   // No es necesario, pero lo dejo porque Víctor lo hace

    public PriceFactory(String country) {
        if (country.equalsIgnoreCase("españa")) {
            price = new PriceEUR();
            System.out.println("Precio España");
        } else if (country.equalsIgnoreCase("UK")) {
            price = new PriceGBP();
            System.out.println("Precio Gran Bretaña");
        } else {
            price = new PriceUSD();
            System.out.println("Precio otro país");
        }
    }

    public float getPrice() {
        return price.getPrice();
    }
}
