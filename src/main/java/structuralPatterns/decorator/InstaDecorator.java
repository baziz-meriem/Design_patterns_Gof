package structuralPatterns.decorator;

public class InstaDecorator extends BaseDecorator{
    public InstaDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Notified through Instagram");
    }
}
