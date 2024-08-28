package creationalPatterns.prototype;

public class mainAPP {
    public static void main(String args[]){
        LetterDoc letter = new LetterDoc();
        letter.setTitle("letter title");
        letter.setContent("letter content");
        letter.setDestination("Company NAME");
        letter.setSender("Meriem Baziz");

        LetterDoc copy = letter.clone();
        System.out.println(copy.toString());
    }
}
