package behavioralPatterns.strategy;

public class Context {
    PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void execute(Float amount){
        strategy.pay(amount);
    }
}
