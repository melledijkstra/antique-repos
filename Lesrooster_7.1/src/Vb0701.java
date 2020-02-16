/**
 * Created by melle_000 on 2015-10-06.
 */
public class Vb0701 {
    public static void main(String args[]) {

        Lesrooster rooster = new Lesrooster();

        Les les = new Les( "Java", new Tijdstip( "maandag", 3 ), "D021" );
        rooster.add( les );

        les = new Les( "Java", new Tijdstip( "maandag", 4 ), "D021" );
        rooster.add( les );

        les = new Les( "Wiskunde", new Tijdstip( "dinsdag", 6 ), "A505" );
        rooster.add( les );

        rooster.print();

    }
}
