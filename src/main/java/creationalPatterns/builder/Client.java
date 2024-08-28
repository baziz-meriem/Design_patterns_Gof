package creationalPatterns.builder;

public class Client {
    public static void main(String[] args) {
        HouseBuilder builder = new GlassHouseBuilder();
        Director director = new Director(builder);
        director.Build("SIMPLE_GLASS");
        Object house = builder.getResult();
        System.out.println(house.toString());


    }
}
