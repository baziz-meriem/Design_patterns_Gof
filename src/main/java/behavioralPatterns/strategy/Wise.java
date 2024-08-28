package behavioralPatterns.strategy;

public class Wise implements PaymentStrategy {

    @Override
    public void pay(Float amount) {
        System.out.println("Wise payment method with "+amount+"DZD");
    }
}
