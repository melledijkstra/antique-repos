/**
 * Created by melle_000 on 2015-10-13.
 */
public class Persoon {
    private String naam;
    private Datum Gebdatum;

    public Persoon(String naam, Datum gdatum) {
        this.naam = naam;
        this.Gebdatum = gdatum;
    }

    public String getNaam() {
        return naam;
    }

    public Datum getGebdatum() {
        return Gebdatum;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s, Geboren: %s",naam,Gebdatum);
    }
}
