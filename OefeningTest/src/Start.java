import java.awt.Graphics;
import javax.swing.*;

public class Start extends JFrame {
	public static void main(String args[]) {
		JFrame frame = new Start();
		frame.setSize(650, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SpeedAnalyzer");
		frame.setContentPane(new Tekenpaneel());
		frame.setVisible(true);
	}
}

class Tekenpaneel extends JPanel {
	private Diagram diagram ;
	
	
	public Tekenpaneel() {
		
		// 5. Maak 50 instanties van Meting met random snelheden tussen
		//    70 en 140. Gebruik een array om de instanties opteslagen.
		// 6. met random autokenteken
		// 7. implement in Meting:
		//    Attribute datum
		//    Method get_date()
		//    Constructor met drie parameters ( numberplate,  speed, date )
		
		Meting[] aMetingen = {
				new Meting("YH-T5-51", 87.5),
				new Meting("YH-T5-52", 85.5),
				new Meting("H-T5-53", 81.5),
				new Meting("YH-T5-54", 82.5),
				new Meting("Y-T5-55", 80.5),
				new Meting("YH-T5-56", 89.5),
				new Meting("YH-T5-57", 140.0),
				new Meting("Y-T5-55", 160.5),
				new Meting("Y-T5-55", 84.5),
				new Meting("Y-T5-55", 85.5),
				new Meting("Y-T5-55", 84.5),
				new Meting("Y-T5-55", 87.5),
				new Meting("Y-T5-55", 88.5),
				new Meting("Y-T5-55", 84.5),
				new Meting("Y-T5-55", 87.5),
				new Meting("Y-T5-55", 83.5),
				new Meting("YH-T5-6", 44.5),
				new Meting("YH-T5-6", 99.5),
				new Meting("YH-T5-5", 79.5),
				new Meting("YH-T-56", 99.5),
				new Meting("YH-T5-56", 67.5),
				new Meting("Y-T5-6", 56.5),
				new Meting("YH-T5-56", 88.5),
				new Meting("YH-T5-6", 80.5),
				new Meting("5H-T5-6", 78),
				new Meting("YH-T5-5", 70.5),
				new Meting("YH-T-6", 88.9),
				new Meting("H-T5-6", 79.5),
				new Meting("H-T5-6", 78.5)};

		diagram = new Diagram();
		int snelheidsbeperking= 80;
		diagram.addMetingen( aMetingen, snelheidsbeperking );
		
		// 8. console output van alle  metingen boven de snelheidsbeperking
		// output: datum - kenteken - snelheid - boetes
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		diagram.teken(g, 10, 170);
	}
}