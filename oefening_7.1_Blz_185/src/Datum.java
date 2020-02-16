/**
 * Created by melle_000 on 2015-09-29.
 */
public class Datum {

    private int dag;
    private int maand;
    private int jaar;

    public Datum() {
        this(1, 1, 2001);
    }

    public Datum(int dag, int maand, int jaar) {
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    public int getDag() {
        return dag;
    }

    public void setDag(int dag) {
        this.dag = dag;
    }

    public int getMaand() {
        return maand;
    }

    public void setMaand(int maand) {
        this.maand = maand;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public String toString() {
        return getDag() + "-"
               + getMaand() + "-"
               + getJaar();
    }

    public void printDate() {
        System.out.println("Dag: "+this.dag+", Maand: "+this.maand+", Jaar: "+this.jaar);
    }
}
