package creationalPatterns.abstractFactory;

public class victorianFurnitureFactory implements FournitureFactory{
    @Override
    public Table createTable() {
        return new victorianTable();
    }


    @Override
    public Chair createChair() {
        return new victorianChair();
    }
}
