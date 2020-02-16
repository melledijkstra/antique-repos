import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Melle Dijkstra on 2015-11-03.
 * The Winkel class is used to represent a store where you can add Artikels to or make basic operations on it.
 * @author Melle Dijkstra
 * @version 1.0
 */
public class Winkel {

    private ArrayList<Artikel> ArtikelLijst = new ArrayList<Artikel>();

    /**
     * Get the count of total artikels in the shop
     * @return The count of artikels in the shop
     */
    public int getArtikelCount() {
        return ArtikelLijst.size();
    }

    /**
     * Add an artikel to the shop
     * @param artikel The artikel you want to add to the shop as an Artikel object
     */
    public void addArtikel(Artikel artikel) {
        ArtikelLijst.add(artikel);
    }

    /**
     * Get the total price of all artikels in the shop
     * @return totaal The total price of the shop
     */
    public double getTotaalWinkelPrijs() {
        int totaal = 0;
        for(Artikel a : ArtikelLijst) {
            totaal += a.getTotaalPrijs();
        }
        return totaal;
    }

    /**
     * Remove an artikel from the shop with the given ID
     * @param index The ID (index) of the artikel to remove
     */
    public void removeArtikelById(int index) {
        ArtikelLijst.remove(index);
    }

    /**
     * Remove an artikel from the store with the given object
     * @param artikel The artikel you want to add as an Artikel object.
     */
    public void removeArtikelByObj(Artikel artikel) {
        ArtikelLijst.remove(artikel);
    }

    /**
     * Get a summary of the shop as a string
     * @return Info from the shop as string
     */
    @Override
    public String toString() {
        // format the decimals with 2 places after . (dot)
        DecimalFormat df = new DecimalFormat("#.00");
        String returnstr = "Winkel beschrijving:\n"
                +"Aantal artikelen: "+this.getArtikelCount()+"\n";
        // loop through artikels to get info that is needed
        for(Artikel a : ArtikelLijst) {
            returnstr+= "Naam: "+a.getOmschrijving()+", Prijs: "+df.format(a.getPrijs())+", Aantal: "+a.getAantal()+", Totaalprijs: "+df.format(a.getTotaalPrijs())+"\n";
        }
        // show the total price of all products in the shop
        returnstr+= "Totale waarde van winkel: "+df.format(this.getTotaalWinkelPrijs());

        return returnstr;
    }
}
