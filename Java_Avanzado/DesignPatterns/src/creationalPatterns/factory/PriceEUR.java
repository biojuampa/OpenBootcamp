package creationalPatterns.factory;

public class PriceEUR implements Price {
    @Override
    public float getPrice() {
        return 1.25f;
    }
}
