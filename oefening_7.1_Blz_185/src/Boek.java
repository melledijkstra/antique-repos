/**
 * Created by melle_000 on 2015-10-13.
 */
public class Boek {
    private String titel;
    private String ISBN;
    private String author;

    public Boek(String titel,String ISBN, String author) {
        this.titel = titel;
        this.ISBN = ISBN;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s (ISBN: %s)",titel,author,ISBN);
    }

}
