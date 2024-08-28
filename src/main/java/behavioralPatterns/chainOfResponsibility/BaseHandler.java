package behavioralPatterns.chainOfResponsibility;

public class BaseHandler implements Handler {
    public BaseHandler nextHandler;

    @Override
    public void setNext(BaseHandler next) {
        nextHandler = next;
    }

    @Override
    public void handle(String request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }

}
