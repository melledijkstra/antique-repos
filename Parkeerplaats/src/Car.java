import java.util.Date;

/**
 * Created by melle_000 on 2015-10-27.
 */
public class Car {
    public static int numberOfCars = 0;
    private int id;
    private Date enterTime;

    public Car() {
        this.id = numberOfCars + 1;
        numberOfCars++;
        System.out.println("Car made with id: "+this.id);
    }

    public int getCarCount() {
        return numberOfCars;
    }

    public void setEnterTime(Date date) {
        this.enterTime = date;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public int getId() {
        return id;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    @Override
    public String toString() {
        return "Car - ID: "+this.id+", enterTime: "+this.enterTime;
    }
}
