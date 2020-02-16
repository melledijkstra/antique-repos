/**
 * Created by melle_000 on 2015-10-06.
 */
public class Tijdstip {
    // day en hour van het tijdstip
    private String day = ""; // aaandag, dinsdag enz.
    private int hour = 0; // 1,2,3,4,5 enz

    // constructor
    Tijdstip(String day, int hour) {
        this.day = day;
        this.hour = hour;
    }

    public String getDay() {
        return day;
    }

    public void changeDag(String day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String toString() {
        return this.day + ", " + this.hour + "e uur";
    }
}
