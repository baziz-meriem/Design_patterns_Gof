package behavioralPatterns.observer;

public class Subscriber1 implements Subscriber{
    @Override
    public void update(String message) {
        System.out.println("Subscribers via instagram: Notified with message: " + message);
    }
}
