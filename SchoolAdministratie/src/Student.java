import java.util.ArrayList;

/**
 * Created by melle_000 on 2015-11-10.
 */
public class Student {

    private static int studentCount = 0;

    private int number;
    private String naam;
    private String geboorteDatum;
    private ArrayList<Tentamen> tentamens = new ArrayList<Tentamen>();

    /**
     * Constructor for making a Student
     * @param naam The name of the student
     * @param geboorteDatum The birthday of the student
     */
    public Student(String naam, String geboorteDatum) {
        studentCount++;
        this.number = studentCount;
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
    }

    /**
     * Add a tentamen to the tentamen list
     * @param t The tentamen to add
     */
    public void addTentamen(Tentamen t) {
        tentamens.add(t);
    }

    /**
     * This function removes a tentamen for a student
     * @param i The index number of the tentamen
     */
    public void removeTentamen(int i) {
        tentamens.remove(i);
    }

    /**
     * Get the ID of the user
     * @return The ID of the user
     */
    public int getNummer() {
        return this.number;
    }

    /**
     * Get the name of the user
     * @return The name of the user
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Set the name of the user
     * @param naam The name of the user
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * Get the
     * @return
     */
    public String getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(String geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

}
