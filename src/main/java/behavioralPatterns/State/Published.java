package behavioralPatterns.State;

public class Published implements State {
    @Override
    public void publish(Document document) {
        System.out.println("Document is already published.");
    }

    @Override
    public void render(Document document) {
        System.out.println("Rendering the published document.");
    }
}
