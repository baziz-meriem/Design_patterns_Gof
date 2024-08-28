package creationalPatterns.prototype;

public class LetterDoc implements DocsPrototype{
    String title;
    String sender;
    String content;
    String destination;

    public void setContent(String content) {
        this.content = content;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public LetterDoc clone() {
        LetterDoc cloneLetter = new LetterDoc();
        cloneLetter.title = this.title;
        cloneLetter.sender = this.sender;
        cloneLetter.content = this.content;
        cloneLetter.destination = this.destination;

        return cloneLetter;
    }

    @Override
    public String toString(){

        return "LetterDoc+ [ title=" + title + ", sender=" + sender + ", content=" + content + ", destination=" + destination + "]";
    }
}
