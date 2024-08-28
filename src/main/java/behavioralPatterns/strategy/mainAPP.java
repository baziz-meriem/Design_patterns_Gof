package behavioralPatterns.strategy;

public class mainAPP {
    public static void main(String[] args){
        Wise strategy = new Wise();

        Context context = new Context();
        context.setStrategy(strategy);

        Float paymentAmount = 1526F;
        context.execute(paymentAmount);

    }
}
