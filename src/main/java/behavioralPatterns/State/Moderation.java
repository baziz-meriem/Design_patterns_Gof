package behavioralPatterns.State;

public class Moderation implements State {
    @Override
    public void publish(Document document) {
        System.out.println("Document is now published.");
        document.changeState(new Published());
    }

    @Override
    public void render(Document document) {
        System.out.println("Document is in moderation. Cannot render.");
    }
}
