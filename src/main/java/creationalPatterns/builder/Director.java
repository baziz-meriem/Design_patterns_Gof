package creationalPatterns.builder;

import java.lang.module.ModuleDescriptor;

public class Director {
    private HouseBuilder builder;
    public Director(HouseBuilder builder) {
        this.builder = builder;
    }

    public void Build(String type) {
        switch (type) {
            case "SIMPLE_GLASS":
                builder.buildWalls();
                builder.buildRoof();
                break;

            case "SIMPLE_WOODEN":
                builder.buildWalls();
                builder.buildRoof();
                break;

            case "SOPHISTICATED_GLASS":
                builder.buildWalls();
                builder.buildRoof();
                builder.buildGarage();
                builder.buildPool();
                builder.buildGarden();
                break;

            case "SOPHISTICATED_WOODEN":
                builder.buildWalls();
                builder.buildRoof();
                builder.buildGarage();
                builder.buildPool();
                builder.buildGarden();
                break;

            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }

    }
}
