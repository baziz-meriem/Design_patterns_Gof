package creationalPatterns.factoryMethod;

public class RoadLogistics extends LogisticsFactory {
    @Override
    public Transport createProduct() {
        return new RoadTransport();
    }
}
