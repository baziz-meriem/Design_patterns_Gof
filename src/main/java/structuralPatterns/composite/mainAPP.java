package structuralPatterns.composite;

import java.util.ArrayList;

public class mainAPP {
    public static void main(String args[]){
        Item Product1 = new product(10.3F,"hair_drrier");
        Item Product2 = new product(100.32F,"chair");
        Item Product3 = new product(500.85F,"Laptop");
        Item Product4 = new product(40F,"shoose");
        Item Product5 = new product(50F,"Rag");
        Item Product6 = new product(80.6F,"door");

        Container box2 = new Container();
        box2.Add(Product4);
        box2.Add(Product5);

        Container box1 = new Container();
        box1.Add(Product1);
        box1.Add(Product2);
        box1.Add(Product3);
        box1.Add(box2);

        Container mainbox = new Container();
        mainbox.Add(box1);
        mainbox.Add(Product6);

        System.out.println(mainbox.CalculatePrice());
    }
}
