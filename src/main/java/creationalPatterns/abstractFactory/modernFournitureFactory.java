package creationalPatterns.abstractFactory;

public class modernFournitureFactory implements FournitureFactory {
    @Override
    public Table createTable() {
        return new modernTable();
    }

    @Override
    public Chair createChair() {
        return new modernChair();
    }
}
