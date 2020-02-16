import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Melle Dijkstra on 2015-10-27.
 */
public class parkingPlace {

    private int maxCars;
    private ArrayList<Car> carsInSpot = new ArrayList<>();

    public parkingPlace(int numberOfSpots) {
        this.maxCars = numberOfSpots;
        System.out.println("Parking place made!");
    }

    public int getFreeParkingSpots() {
        return maxCars - carsInSpot.size();
    }

    public boolean Enter(Car car) {
        if(this.getFreeParkingSpots() > 0) {
            carsInSpot.add(car);
            car.setEnterTime(new Date());
            return true;
        } else {
            return false;
        }
    }

    public void showCars() {
        for(Car car : carsInSpot) {
            System.out.println(car.toString());
        }
    }
}
