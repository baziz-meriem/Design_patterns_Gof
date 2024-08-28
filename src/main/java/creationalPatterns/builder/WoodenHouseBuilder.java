package creationalPatterns.builder;

public class WoodenHouseBuilder implements HouseBuilder {
    private WoodenHouse house;

    public WoodenHouseBuilder() {
        this.house = new WoodenHouse();
    }
    @Override
    public void buildWalls() {
        this.house.setWalls("Glass Walls");
    }


    @Override
    public void buildPool() {
        house.setPool("Glass Pool");
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
    public WoodenHouse getResult() {
        return house;
    }
}
