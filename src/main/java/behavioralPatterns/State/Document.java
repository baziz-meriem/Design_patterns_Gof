package behavioralPatterns.State;

public class Document {
    private State state;

    public Document(State state) {
        this.state = state;
    }

    public void render() {
        state.render(this);
    }

    public void publish() {
        state.publish(this);
    }

    public void changeState(State state) {
        this.state = state;
    }
}
