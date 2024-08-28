package structuralPatterns.bridge;

public class mainAPP {
    public static void main(String[] args){
        RedColor red = new RedColor();
        Circle circle = new Circle(red);
        circle.applyColor();

        BlueColor blue = new BlueColor();
        Square square = new Square(blue);
        square.applyColor();
    }
}
