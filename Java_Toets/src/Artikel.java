import java.text.DecimalFormat;

/**
 * Created by Melle Dijkstra on 2015-11-03.
 * This class is used to create an Artikel which you can use to add it to a shop.
 * You can also make additions so you can do more with an Artikel than just adding it to a shop
 * @author Melle Dijkstra
 * @version 1.0
 */
public class Artikel {
    private String omschrijving;
    private double prijs;
    private int aantal;

    /**
     * The constructor for an Artikel.
     * This creates an Artikel which you can add to the shop
     * @param oms The description (name) for the Artikel
     * @param prijs The price of the Artikel
     * @param aantal The amount of this Artikel in the shop
     */
    public Artikel(String oms,double prijs, int aantal) {
        /*
         * omschrijving is the name, description of the product
         * prijs is the price of the product
         * aantal is how many products are currently in the shop
         */
        this.omschrijving = oms;
        this.prijs = prijs;
        this.aantal = aantal;
    }

    /**
     * Get the description (name) of an artikel
     * @return The description (name) of an artikel
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * Set the description (name) for an artikel
     * @param omschrijving The new description (name) for the artikel
     */
    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    /**
     * Get the current price of the artikel
     * @return The current price of the artikel
     */
    public double getPrijs() {
        return prijs;
    }

    /**
     * Get the amount of this artikel that are currently in the shop
     * @return The amount of this Artikel in the shop
     */
    public int getAantal() {
        return aantal;
    }

    /**
     * Set the new price for the Artikel
     * @param prijs The new price
     */
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    /**
     * Set the new amount of artikels that are in the shop
     * @param aantal The amount of artikels
     */
    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    /**
     * The Artikel as summary in string format
     * @return The summary of an Artikel
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Naam: "+this.omschrijving+", Aantal: "+this.aantal+" Prijs: "+df.format(this.prijs) + ", Totaalprijs: " + df.format(this.getTotaalPrijs());
    }

    /**
     * Get the total price of a specific Artikel that are in the shop
     * the price times the amount of this artikel in the shop
     * @return The total price
     */
    public double getTotaalPrijs() {
        return this.prijs * this.aantal;
    }
}
