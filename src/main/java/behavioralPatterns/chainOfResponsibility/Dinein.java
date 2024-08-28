package behavioralPatterns.chainOfResponsibility;

public class Dinein extends BaseHandler{


    @Override
    public void handle(String request) {
        if (request.equals("Dinein")) {
            System.out.println("Order treated by Dine in Team");
        }
        else{
            super.handle(request);
        }
    }
    }

