package creationalPatterns.builder;

public class GlassHouseBuilder implements HouseBuilder {
    GlassHouse  house = new GlassHouse();
    @Override
    public void buildPool() {
        house.setPool("Glass Pool");
    }
    @Override
    public void buildWalls() {
        house.setWalls("Glass Walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Glass Roof");
    }

    @Override
    public void buildGarage() {
        house.setGarage("Glass Garage");
    }

    @Override
    public void buildGarden() {
        house.setGarden("Glass Garden");
    }

    @Override
    public GlassHouse getResult() {
        return house;
    }
}
