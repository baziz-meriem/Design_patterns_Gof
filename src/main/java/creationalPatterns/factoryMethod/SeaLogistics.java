package creationalPatterns.factoryMethod;

public class SeaLogistics extends LogisticsFactory {
    @Override
    public Transport createProduct() {
        return new SeaTransport();
    }
}
