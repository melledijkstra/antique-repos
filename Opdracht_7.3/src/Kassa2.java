/**
 * Created by Melle Dijkstra
 */
import java.util.*;

public class Kassa2 {
    private ArrayList<Double> lijst;

    public Kassa2() {
        lijst = new ArrayList<Double>();
    }

    public void voerIn( double bedrag ) {
        lijst.add( bedrag );
    }

    public double berekenTotaal() {
        double totaal = 0;
        for( Double d : lijst ) {
            totaal += d;
        }
        return totaal;
    }

    public void printKassabon() {
        for( Double d : lijst )
            System.out.printf( "%8.2f%n", d );

        System.out.println( "  ______" );
        System.out.printf( "%8.2f%n", berekenTotaal() );
    }
}


