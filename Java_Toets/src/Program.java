/**
 * Created by Melle Dijkstra on 2015-11-03.
 * The main program where a basic example of a shop is used
 */
public class Program {
    public static void main(String args[]) {
        // create a new shop
        Winkel winkel = new Winkel();

        // make some artikels
        Artikel Cola = new Artikel("Cola",1.50,10);
        Artikel Snert = new Artikel("Snert",1.10,5);
        Artikel Komkommer = new Artikel("Komkommer",0.70,5);
        Artikel Mosterd = new Artikel("Mosterd",1.00,4);

        // add artikels to shop
        winkel.addArtikel(Cola);
        winkel.addArtikel(Snert);
        winkel.addArtikel(Komkommer);
        winkel.addArtikel(Mosterd);

        // possibility to remove products example: remove komkommer from shop
        // winkel.removeArtikelByObj(Komkommer);

        // print shop info to console
        System.out.println(winkel.toString());

    }
}
