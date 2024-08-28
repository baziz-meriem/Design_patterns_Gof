package creationalPatterns.builder;

public class GlassHouse {
    // Attributes of a Glass House
    private String walls;
    private String pool;
    private String roof;
    private String garage;
    private String garden;

    // Setters for attributes
    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "GlassHouse{" +
                "walls='" + walls + '\'' +
                ", pool='" + pool + '\'' +
                ", roof='" + roof + '\'' +
                ", garage='" + garage + '\'' +
                ", garden='" + garden + '\'' +
                '}';
    }
}
