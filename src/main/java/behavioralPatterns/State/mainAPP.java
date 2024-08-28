package behavioralPatterns.State;

public class mainAPP {
    public static void main(String[] args){
        Moderation moderationDoc = new Moderation();
        Document document = new Document(moderationDoc);

        document.render();  // Output: Document is in moderation. Cannot render.
        document.publish(); // Output: Document is now published.

        document.render();  // Output: Rendering the published document.
        document.publish(); // Output: Document is already published.

    }
}
