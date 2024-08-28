package creationalPatterns.builder;

public interface HouseBuilder {
    public void buildWalls();
    public void buildPool();
    public void buildRoof();
    public void buildGarage();
    public void buildGarden();
    Object getResult();
}
