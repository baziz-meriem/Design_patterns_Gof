package structuralPatterns.decorator;

public class mainAPP {
    public static void main(String[] args){
        Notifier a = new Message("Please note that this is a warning: the deadline has been updated. " +
                "You are required to submit the deliverable by 14:00 tomorrow.");
        SMSDecorator sms = new SMSDecorator(a);
        TelegramDecorator telegram = new TelegramDecorator(sms);
        InstaDecorator insta = new InstaDecorator(telegram);
        insta.sendMessage();
    }
}
