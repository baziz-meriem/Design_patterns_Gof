package behavioralPatterns.chainOfResponsibility;

public class Delivery extends BaseHandler{

    @Override
    public void handle(String request) {
        if (request.equals("Delivery")) {
            System.out.println("Order treated by Delivery Team");
        }
        else{
            super.handle(request);
        }
    }
}
