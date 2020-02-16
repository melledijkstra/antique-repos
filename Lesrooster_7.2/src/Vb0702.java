import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by melle_000 on 2015-10-06.
 */
public class Vb0702 extends JFrame {
    public static void main(String args[]) {

        JFrame frame = new Vb0702();
        frame.setSize( 400, 280 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle( "Voorbeeld 0702 Lesrooster" );
        frame.setContentPane(new roosterPaneel());
        frame.setVisible(true);

    }
}

class roosterPaneel extends JPanel {
    private Lesrooster rooster;
    private JTextArea tekstgebied;
    private JButton knop;

    public roosterPaneel() {
        rooster = new Lesrooster();

        Les les = new Les( "Java", new Tijdstip( "maandag", 3 ), "D021" );
        rooster.add(les);

        les = new Les( "Java", new Tijdstip( "maandag", 4 ), "D021" );
        rooster.add(les);

        les = new Les( "Wiskunde", new Tijdstip( "dinsdag", 6 ), "A505" );
        rooster.add(les);

        tekstgebied = new JTextArea(10,30);
        add(new JScrollPane(tekstgebied));

        class Knophandler implements ActionListener {
            public void actionPerformed( ActionEvent e ) {
                tekstgebied.setText( rooster.toString() );
            }
        }

        knop = new JButton("Rooster");
        knop.addActionListener(new Knophandler());
        add(knop);
    }
}
