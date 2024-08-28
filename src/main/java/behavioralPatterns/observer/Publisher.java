package behavioralPatterns.observer;

import java.util.ArrayList;


public class Publisher {
    ArrayList<Subscriber> subscribersList = new ArrayList<>() ;
    public void subscribe(Subscriber subscriber) {
        subscribersList.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        subscribersList.remove(subscriber);
    }
    public void publish(String message) {
        for (Subscriber subscriber : subscribersList) {
            subscriber.update(message);
        }
    }
}
