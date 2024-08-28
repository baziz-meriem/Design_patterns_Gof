package behavioralPatterns.State;

public interface State {
    void publish(Document document);
    void render(Document document);
}
