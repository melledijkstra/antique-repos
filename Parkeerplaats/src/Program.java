/**
 * Created by melle_000 on 2015-10-27.
 */
public class Program {
    public static void main(String args[]) {
        // make new parking place
        parkingPlace parkingPlace = new parkingPlace(10);

        for(int i = 0;i < 20;i++) {
            Car car = new Car();
            if(parkingPlace.Enter(car)) {
                System.out.println("Car entered!");
            } else {
                System.out.println("Parking place full!");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(parkingPlace.getFreeParkingSpots());
        parkingPlace.showCars();
    }
}
