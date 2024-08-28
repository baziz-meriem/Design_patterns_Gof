package structuralPatterns.composite;

public class product implements Item{
    private Float Price;
    private String Name;

    public product(Float Price, String Name) {
        this.Price = Price;
        this.Name = Name;
    }
    @Override
    public Float CalculatePrice() {
        return gePrice();
    }

    private Float gePrice() {
        return Price;
    }
}
