package structuralPatterns.decorator;

public abstract class BaseDecorator implements Notifier{
    private Notifier wrappee;
    public BaseDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }
    @Override
    public void sendMessage(){

        wrappee.sendMessage();
    };
}
