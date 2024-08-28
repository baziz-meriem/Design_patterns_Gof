package behavioralPatterns.chainOfResponsibility;

public class Takeout extends BaseHandler {
    @Override
    public void handle(String request) {
        if (request.equals("Takeout")) {
            System.out.println("Order treated by Takeout Team");
        }
        else{
            super.handle(request);
        }
    }
    }

