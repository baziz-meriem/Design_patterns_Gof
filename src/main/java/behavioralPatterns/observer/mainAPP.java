package behavioralPatterns.observer;

public class mainAPP {
    public static void main(String[] args){
        Publisher publisher = new Publisher();
        Subscriber1 instaSub1 = new Subscriber1();
        Subscriber2 faceSub1 = new Subscriber2();
        publisher.subscribe(instaSub1);
        publisher.subscribe(faceSub1);

        publisher.publish("Hello World, to every subscriber");
    }
}
