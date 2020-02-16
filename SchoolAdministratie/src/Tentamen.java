/**
 * Created by melle_000 on 2015-11-10.
 */
public class Tentamen {
    private String vakNaam;
    private double grade;

    public String getVakNaam() {
        return vakNaam;
    }

    public void setVakNaam(String vakNaam) {
        this.vakNaam = vakNaam;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Tentamen(String vaknaam,double grade) {
        this.vakNaam = vaknaam;
        this.grade = grade;
    }

}
