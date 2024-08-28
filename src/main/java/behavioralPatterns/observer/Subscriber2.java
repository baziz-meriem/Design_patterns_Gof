package behavioralPatterns.observer;

public class Subscriber2 implements Subscriber {

    @Override
    public void update(String message) {
        System.out.println("Subscribers via facebook: Notified with message: " + message);
    }
}
