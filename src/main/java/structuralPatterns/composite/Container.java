package structuralPatterns.composite;
import java.util.ArrayList;
import java.util.Iterator;

public class Container implements Item {
    ArrayList<Item> Components =  new ArrayList<>();

    public ArrayList GetElements(){

        return Components;
    }
    public void Add(Item item){
        Components.add(item);
    }
    public void removeItem(Item item) {
        Components.remove(item);
    }
    public Float CalculatePrice(){
        ArrayList<Item> Elements = this.GetElements();
        Float totalPrice = 0.0F;
        Iterator<Item> it = Elements.iterator();

        while(it.hasNext()){
            Item item = it.next();
            totalPrice += item.CalculatePrice();       }
        return totalPrice;
    }
}
