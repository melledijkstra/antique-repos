import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by melle_000 on 2015-08-25.
 */
public class KassaPaneel extends JPanel {

    private JTextField bedragVak, subtotaalVak;
    private Kassa kassa;

    public KassaPaneel() {
        //kies GridLayout
        setLayout(new GridLayout(2,2,10,10));
        Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(border);

        // maak een kassa
        kassa = new Kassa();

        //maak de tekstvakken
        bedragVak = new JTextField(10);
        bedragVak.addActionListener(new BedragVakHandler());
        bedragVak.setHorizontalAlignment(JTextField.RIGHT);

        subtotaalVak = new JTextField(10);
        subtotaalVak.setBackground(Color.YELLOW);

        // zorg dat de gebruiker niet kan wijzigen en lijn rechts uit
        subtotaalVak.setEditable(false);
        subtotaalVak.setHorizontalAlignment(JTextField.RIGHT);

        // maak de labels
        JLabel bedragLabel = new JLabel("Voer bedrag in");
        JLabel subtotaalLabel = new JLabel("subtotaal");

        // voeg de componenten toe aan het paneel
        add(bedragLabel);
        add(bedragVak);
        add(subtotaalLabel);
        add(subtotaalVak);

    }

    class BedragVakHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String invoer = bedragVak.getText();
            double invoerBedrag = Double.parseDouble(invoer);

            // geef het bedrag door aan kassa
            kassa.telOp(invoerBedrag);

            // vraag om het subtotaal en formateer dit
            double st = kassa.getSubtotaal();
            subtotaalVak.setText(String.format("%.2f",st));
        }
    }
}