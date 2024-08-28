package behavioralPatterns.chainOfResponsibility;

public class mainAPP {
    public static void main(String args[]){
        String request ="Dinein";
        BaseHandler BaseHandler = new BaseHandler();
        BaseHandler DineinHandler = new Dinein();
        BaseHandler TakeoutHandler =  new Takeout();
        BaseHandler DeliveryHandler = new Delivery();

        DineinHandler.setNext(TakeoutHandler);
        TakeoutHandler.setNext(DeliveryHandler);
        DeliveryHandler.setNext(DineinHandler);

        TakeoutHandler.handle(request);
    }
}
