import java.util.ArrayList;

/**
 * Created by melle_000 on 2015-10-06.
 */
public class Lesrooster {
    private ArrayList<Les> lijst;

    public Lesrooster() {
        lijst = new ArrayList<Les>();
    }

    public void add(Les les) {
        lijst.add(les);
    }

    public void print() {
        lijst.forEach(System.out::println);
    }
}
