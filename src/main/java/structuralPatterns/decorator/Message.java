package structuralPatterns.decorator;

public class Message implements Notifier{
    String message;
    public Message(String message) {
        this.message = message;
    }
    @Override
    public void sendMessage() {
        System.out.println(message);
    }
}
