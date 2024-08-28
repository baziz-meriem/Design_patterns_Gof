package structuralPatterns.decorator;


public class SMSDecorator extends BaseDecorator{
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Notified Through SMS");
    }
}
