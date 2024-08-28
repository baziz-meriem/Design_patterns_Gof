package behavioralPatterns.strategy;

public class ElDahabia implements PaymentStrategy {
    @Override
    public void pay(Float amount) {
        System.out.println("El dahabia payment method with "+amount+"DZD");
    }
}
