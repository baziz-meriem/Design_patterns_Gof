package structuralPatterns.decorator;


public class TelegramDecorator extends BaseDecorator{
    public TelegramDecorator(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Notified Through Telegram");
    }
}
