package behavioralPatterns.chainOfResponsibility;

public interface Handler {
    void setNext(BaseHandler next);
    void handle(String request);
}
