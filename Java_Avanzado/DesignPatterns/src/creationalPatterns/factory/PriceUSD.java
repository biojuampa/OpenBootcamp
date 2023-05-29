package creationalPatterns.factory;

public class PriceUSD implements Price {
    @Override
    public float getPrice() {
        return 0.95f;
    }
}
