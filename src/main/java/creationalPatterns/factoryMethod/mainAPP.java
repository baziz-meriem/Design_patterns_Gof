package creationalPatterns.factoryMethod;

public class mainAPP {
    public static void main(String args[]){
        LogisticsFactory seaLogistics = new SeaLogistics();
        Transport seaTransport = seaLogistics.createProduct();
        seaTransport.deliver();

        LogisticsFactory roadLogistics = new RoadLogistics();
        Transport roadTransport = roadLogistics.createProduct();
        roadTransport.deliver();
    }
}
