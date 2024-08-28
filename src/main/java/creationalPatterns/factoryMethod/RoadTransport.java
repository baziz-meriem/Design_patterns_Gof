package creationalPatterns.factoryMethod;

public class RoadTransport implements Transport {

    @Override
    public void deliver() {
        System.out.println("RoadLogistics delivered");
    }
}
