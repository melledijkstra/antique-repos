/**
 * Created by melle_000 on 2015-10-13.
 */
public class Main {
    public static void main(String args[]) {
        Persoon melle = new Persoon("Melle Dijkstra",new Datum(9,3,1998));
        System.out.println(melle.toString());

        Boek nijntje = new Boek("Nijntje","DHJK4543J4HBN2NNB6","Melle Dijkstra");
        System.out.println(nijntje.toString());
    }
}
