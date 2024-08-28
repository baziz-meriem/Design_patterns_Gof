package creationalPatterns.factoryMethod;

public class SeaTransport implements Transport {

    @Override
    public void deliver() {
        System.out.println("deliver SeaLogistics");
    }
}
