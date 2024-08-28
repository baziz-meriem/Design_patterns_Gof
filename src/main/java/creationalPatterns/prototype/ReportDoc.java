package creationalPatterns.prototype;

public class ReportDoc implements DocsPrototype{
    String title;
    String author;
    String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public ReportDoc clone() {

        return null;
    }
    @Override
    public String toString(){

        return "ReportDoc [title=" + title + ", author=" + author + ", content=" + content + "]";
    }
}
