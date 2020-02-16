/**
 * Created by melle_000 on 2015-10-06.
 */
public class Les {
    private String vak;
    private Tijdstip tijdstip;
    private String lokaal;

    public Les(String vak, Tijdstip tijdstip, String lokaal) {
        this.vak = vak;
        this.tijdstip = tijdstip;
        this.lokaal = lokaal;
    }

    public String getVak() {
        return vak;
    }

    public void setVak(String vak) {
        this.vak = vak;
    }

    public Tijdstip getTijdstip() {
        return tijdstip;
    }

    public void setTijdstip(Tijdstip tijdstip) {
        this.tijdstip = tijdstip;
    }

    public String getLokaal() {
        return lokaal;
    }

    public void setLokaal(String lokaal) {
        this.lokaal = lokaal;
    }

    @Override
    public String toString() {
        return String.format("%-13s %s in %s",vak,tijdstip,lokaal);
    }
}
